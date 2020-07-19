import { Component, OnInit } from '@angular/core';
import { ChamadoDTO,chamadoDTOClear } from '../../models/chamado';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ChamadoService } from '../../service/chamado.service';

@Component({
  selector: 'app-chamado-detalhe',
  templateUrl: './chamado-detalhe.component.html',
  styleUrls: ['./chamado-detalhe.component.less']
})
export class ChamadoDetalheComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private chamadoService: ChamadoService,
    private location: Location
  ) { }

  chamado: ChamadoDTO = chamadoDTOClear;

  id = +this.route.snapshot.paramMap.get('id');

  ngOnInit(): void {
    if(this.id){
      this.getChamado();
    }
  }

  getChecklistGeralCount() : Object {
    return this.chamado.solucaoTecnica.checklistGeralDTO.length;
  }

  getChecklistConcluidoCount() : Object {
    return this.chamado.solucaoTecnica.checklistGeralDTO.filter( itemChecklist => itemChecklist.concluido == true).length;
  }

  getChamado(): void {
    this.chamadoService.getChamado(this.id)
      .subscribe(chamado => this.chamado = chamado);
  }

  goBack(): void {
    this.location.back();
  }

  fecharChamado() : void {
    console.log("Fechar chmado");
  }


}
