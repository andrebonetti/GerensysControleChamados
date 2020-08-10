import { Component, OnInit } from '@angular/core';
import { GridTypeEnum } from '../../models/enums/grid_type'
import { ChamadoService } from 'src/app/service/chamado.service';
import { ChamadoDTO } from 'src/app/models/chamado';

@Component({
  selector: 'app-chamados',
  templateUrl: './chamados.component.html',
  styleUrls: ['./chamados.component.less']
})
export class ChamadosComponent implements OnInit {

  chamados : ChamadoDTO[];
  gridType : String = GridTypeEnum.GRIP.valueOf();

  constructor(
    private chamadoService: ChamadoService) {}

  ngOnInit(): void {
    this.getChamados();
  }

  getChamados() : void{
    this.chamadoService.getChamados().subscribe(chamados => this.chamados = chamados);
  }

  changeGridType() : void{
    if(this.gridType == GridTypeEnum.LIST.valueOf()){
      this.gridType = GridTypeEnum.GRIP.valueOf();
    }else{
      this.gridType = GridTypeEnum.LIST.valueOf();
    }
  }

}
