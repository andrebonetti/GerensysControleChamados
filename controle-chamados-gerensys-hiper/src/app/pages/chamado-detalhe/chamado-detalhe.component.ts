import { Component, OnInit } from '@angular/core';
import { ChamadoDTO } from '../../models/chamado';
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

  chamado: ChamadoDTO;

  ngOnInit(): void {
    this.getChamado();
  }

  getChamado(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.chamadoService.getChamado(id)
      .subscribe(chamado => this.chamado = chamado);
  }

  goBack(): void {
    this.location.back();
  }

}
