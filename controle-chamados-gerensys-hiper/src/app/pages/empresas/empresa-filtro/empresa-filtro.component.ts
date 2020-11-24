import { Component, OnInit } from '@angular/core';
import { ChaveValor } from 'src/app/models/chaveValor';
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';
import { InputSelect } from 'src/app/models/form/input-select';
import { InputText } from 'src/app/models/form/input-text';
import { MensagemService } from 'src/app/service/mensagem.service';

@Component({
  selector: 'app-empresa-filtro',
  templateUrl: './empresa-filtro.component.html',
  styleUrls: ['./empresa-filtro.component.less']
})
export class EmpresaFiltroComponent implements OnInit {

  inputBusca : InputText = {
    id: "busca",
    label: "Busca",
    name: "busca",
    placeholder: "",
    labelType : InputLabelTypeEnum.PREPEND,
    value:""
  };

  inputAtivo : InputSelect = {
    id: "ativo",
    label: "Ativo",
    name: "ativo",
    placeholder: "Escolha...",
    labelType : InputLabelTypeEnum.PREPEND,
    content : [],
    optionId : "chave",
    optionText: "valor",
    selected:null
  }

  constructor(private mensagemService: MensagemService){
  }

  ngOnInit(): void {
    this.getAtivoOpt();
  }

  buscar(){
    this.mensagemService.add("buscar");
  }

  getAtivoOpt() : void{
    let ativoOpt : ChaveValor[] = [
      {
        chave : "0",
        valor : "Não"
      },
      {
        chave : "1",
        valor : "Sim"
      }
    ]

    this.inputAtivo.content = ativoOpt;
  }

}
