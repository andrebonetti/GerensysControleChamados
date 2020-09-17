import { Component, OnInit } from '@angular/core';
import { FilaService } from '../../../service/fila.service';
import { MensagemService } from 'src/app/service/mensagem.service';
import { FilaDTO } from '../../../models/fila';
import { DropEvent } from 'ng-drag-drop';
import { UtilService } from 'src/app/service/util.service';
import { ChamadoDTO } from 'src/app/models/chamado';

@Component({
  selector: 'app-fila-grid',
  templateUrl: './fila-grid.component.html',
  styleUrls: ['./fila-grid.component.less']
})
export class FilaGridComponent implements OnInit {

  filasDTO : FilaDTO[];

  constructor(
    private mensagemService: MensagemService,
    private filaService: FilaService,
    private utils: UtilService) {}

  ngOnInit(): void {
    this.getFilas();
  }

  getFilas(): void {
    this.filaService.getFilasFull().subscribe(filas => this.filasDTO = filas);
  }

  collapse(){
    this.mensagemService.add("collapse");
  }

  getDragScope(idFilaAtual:Number): String[]{

    let returnDragScops : String[] = [];
    this.filasDTO.forEach(itemFila => {
      if(itemFila.id != idFilaAtual){
        returnDragScops.push('fila-lista-'+itemFila.id);
      }
    });

    return returnDragScops;
  }

  dropItemOnDragCard(e: DropEvent,filaDTO: FilaDTO) {
    let chamadoAtual = e.dragData;

    let filaAtualIndex = this.filasDTO.findIndex(itemFila => itemFila.id == chamadoAtual.filaDTO.id);
    if(this.filasDTO[filaAtualIndex]){
      this.filasDTO[filaAtualIndex].chamadosDTO = this.filasDTO[filaAtualIndex].chamadosDTO.filter(
        itemChamado => itemChamado.id !==  chamadoAtual.id)
    }

    let filaDestinoIndex = this.filasDTO.findIndex(itemFila => itemFila.id == filaDTO.id);
    if(this.filasDTO[filaDestinoIndex]){
      chamadoAtual.filaDTO = filaDTO;
      this.filasDTO[filaDestinoIndex].chamadosDTO.push(chamadoAtual);
    }

  }

}
