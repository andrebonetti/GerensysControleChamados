import { Component, OnInit } from '@angular/core';
import { EmpresaDTO } from 'src/app/models/empresa';
import { EmpresaService } from 'src/app/service/empresa.service';
import { MensagemService } from 'src/app/service/mensagem.service';

@Component({
  selector: 'app-empresas',
  templateUrl: './empresas.component.html',
  styleUrls: ['./empresas.component.less']
})
export class EmpresasComponent implements OnInit {

  empresasDTO : EmpresaDTO[];

  constructor(
    private mensagemService: MensagemService,
    private empresaService : EmpresaService) { }

  ngOnInit(): void {
    this.getUsuarios();
  }

  getUsuarios(): void {
    this.empresaService.getEmpresas().subscribe(empresas => this.empresasDTO = empresas);
  }

}
