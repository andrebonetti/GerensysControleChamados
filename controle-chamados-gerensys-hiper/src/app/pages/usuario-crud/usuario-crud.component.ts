import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UsuarioService } from '../../service/usuario.service'
import { Location } from '@angular/common';
import { UsuarioDTO, usuarioDTOClear } from 'src/app/models/usuario';

@Component({
  selector: 'app-usuario-crud',
  templateUrl: './usuario-crud.component.html',
  styleUrls: ['./usuario-crud.component.less']
})
export class UsuarioCrudComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private usuarioService: UsuarioService,
    private location: Location
  ) { }

  usuario: UsuarioDTO = usuarioDTOClear;

  id = +this.route.snapshot.paramMap.get('id');

  ngOnInit(): void {
    if(this.id){
      this.getUsuario();
    }
  }

  getUsuario():void{
    this.usuarioService.getUsuario(this.id)
      .subscribe(usuario => this.usuario = usuario);
  }

  goBack(): void {
    this.location.back();
  }

}
