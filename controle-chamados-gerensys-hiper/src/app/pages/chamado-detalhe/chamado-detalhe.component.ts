import { Component, OnInit } from '@angular/core';
import { ChamadoDTO,chamadoDTOClear } from '../../models/chamado';
import { VisualizacaoTipoEnum } from '../../models/enums/visualizacao_tipo';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { ChamadoService } from '../../service/chamado.service';
import { MensagemService } from 'src/app/service/mensagem.service';
import { InputText } from 'src/app/models/form/input-text';
import { InputLabelTypeEnum } from 'src/app/models/enums/input_label_type';
import { InputSelect } from 'src/app/models/form/input-select';
import { ChamadoCategoriaService } from 'src/app/service/chamado-categoria.service';
import { ChamadoSubCategoriaService } from 'src/app/service/chamado-sub-categoria.service';
import { ToastService } from 'src/app/templates/form/ngb-toast/toast.service';

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
    private chamadoCategoriaService : ChamadoCategoriaService,
    private chamadoSubCategoriaService : ChamadoSubCategoriaService,
    private location: Location,
    private toastService: ToastService
  ) { }

  chamado: ChamadoDTO = chamadoDTOClear;

  id = +this.route.snapshot.paramMap.get('id');

  tipoVisualizacao : String = VisualizacaoTipoEnum.DETALHES.valueOf();

  inputTitulo : InputText = {
    id: "titulo",
    label: "Descrição",
    name: "titulo",
    placeholder: "",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:""
  };

  inputDetalhe : InputText = {
    id: "detalhe",
    label: "Detalhes",
    name: "detalhe",
    placeholder: "",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:""
  };

  inputCategoria : InputSelect = {
    id: "categoria",
    label: "Categoria",
    name: "categoria",
    placeholder: "Escolha...",
    labelType : InputLabelTypeEnum.DEFAULT,
    content : [],
    optionId : "id",
    optionText: "descricao",
    selected:null
  }

  inputSubCategoria : InputSelect = {
    id: "subCategoria",
    label: "SubCategoria",
    name: "subCategoria",
    placeholder: "Escolha...",
    labelType : InputLabelTypeEnum.DEFAULT,
    content : [],
    optionId : "id",
    optionText: "descricao",
    selected:null
  }

  ngOnInit(): void {
    if(this.id){
      this.getChamado();
    }else{
      this.getChamadoCategoria();
      this.getChamadoSubCategoria();
    }
  }

  getChamadoCategoria(){
    this.chamadoCategoriaService.getChamadoCategoria().subscribe(categoria => this.inputCategoria.content = categoria);
  }

  getChamadoSubCategoria(){
    this.chamadoSubCategoriaService.getChamadoSubCategoria().subscribe(subcategoria => this.inputSubCategoria.content = subcategoria);
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

  changeCategoria(event) : void {
    this.chamadoSubCategoriaService.getChamadoSubCategoria().subscribe(
      subcategorias => this.inputSubCategoria.content = subcategorias
      .filter(sub => sub.categoriaDTO.id == event.target.value));
  }

  showSuccess() {
    console.log("SUCCESS")
    this.toastService.show('Usuario salvo com sucesso', { classname: 'bg-success text-light', delay: 5000 });
  }


}
