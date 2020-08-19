import { Component, OnInit } from '@angular/core';
import { ChamadoDTO,chamadoDTOClear } from '../../models/chamado';
import { VisualizacaoTipoEnum } from '../../models/enums/visualizacao_tipo';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ChamadoService } from '../../service/chamado.service';
import { MensagemService } from 'src/app/service/mensagem.service';

@Component({
  selector: 'app-chamado-detalhe',
  templateUrl: './chamado-detalhe.component.html',
  styleUrls: ['./chamado-detalhe.component.less']
})
export class ChamadoDetalheComponent implements OnInit {

  constructor(
    private mensagemService: MensagemService,
    private route: ActivatedRoute,
    private chamadoService: ChamadoService,
    private location: Location
  ) { }

  chamado: ChamadoDTO = chamadoDTOClear;

  id = +this.route.snapshot.paramMap.get('id');

  tipoVisualizacao : String = VisualizacaoTipoEnum.DETALHES.valueOf();

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
    this.mensagemService.add("Fechar chamado");
  }


}
