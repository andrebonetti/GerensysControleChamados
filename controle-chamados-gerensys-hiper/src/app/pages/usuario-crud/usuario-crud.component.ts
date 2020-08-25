import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UsuarioService } from '../../service/usuario.service'
import { Location } from '@angular/common';
import { UsuarioDTO, usuarioDTOClear } from 'src/app/models/usuario';
import { InputText } from 'src/app/models/form/input-text';
import { InputSelect } from 'src/app/models/form/input-select';
import { InputPassword } from 'src/app/models/form/input-password';
import { UsuarioPerfilService } from 'src/app/service/usuario-perfil.service';
import { InputLabelTypeEnum } from "src/app/models/enums/input_label_type";
import { ToastService } from 'src/app/templates/form/ngb-toast/toast.service';

@Component({
  selector: 'app-usuario-crud',
  templateUrl: './usuario-crud.component.html',
  styleUrls: ['./usuario-crud.component.less']
})
export class UsuarioCrudComponent implements OnInit {

  inputNome : InputText = {
    id: "nome",
    label: "Nome",
    name: "nome",
    placeholder: "",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:null
  };

  inputEmail : InputText = {
    id: "email",
    label: "Email",
    name: "email",
    placeholder: "",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:null
  };

  inputPerfis : InputSelect = {
    id: "perfil",
    label: "Perfil",
    name: "perfil",
    placeholder: "Escolha...",
    labelType : InputLabelTypeEnum.DEFAULT,
    content : [],
    optionId : "id",
    optionText: "nome",
    selected : null,
  }

  inputPassword : InputPassword = {
    id: "senha",
    label: "Senha",
    name: "senha",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:null
  };

  inputPasswordConfirm : InputPassword = {
    id: "senhaConfirm",
    label: "Confirmação Senha",
    name: "senhaConfirm",
    labelType : InputLabelTypeEnum.DEFAULT,
    value:null
  };

  constructor(
    private route: ActivatedRoute,
    private usuarioService: UsuarioService,
    private usuarioPerfilService: UsuarioPerfilService,
    private location: Location,
    public toastService: ToastService
  ) { }

  usuario: UsuarioDTO = usuarioDTOClear;

  showConfirmacaoSenha : Boolean = true;

  id = +this.route.snapshot.paramMap.get('id');

  ngOnInit(): void {
    if(this.id){
      this.getUsuario();
      this.getPerfis();

      this.showConfirmacaoSenha = false;
    }
  }

  getUsuario():void{
    this.usuarioService.getUsuario(this.id)
      .subscribe(usuario => {
        this.usuario = usuario,
        this.inputNome.value = usuario.nome;
        this.inputEmail.value = usuario.email;
        this.inputPerfis.selected = usuario.perfilDTO.id;
        this.inputPassword.value = usuario.senha;
      });
  }

  getPerfis() : void{
    this.usuarioPerfilService.getUsuarioPerfis().subscribe( usuarios => this.inputPerfis.content = usuarios );
  }

  showSuccess() {
    console.log("SUCCESS")
    this.toastService.show('Usuario salvo com sucesso', { classname: 'bg-success text-light', delay: 5000 });
  }

  goBack(): void {
    this.location.back();
  }

}
