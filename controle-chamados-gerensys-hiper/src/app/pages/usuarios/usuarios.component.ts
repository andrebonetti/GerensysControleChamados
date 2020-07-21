import { Component, OnInit } from '@angular/core';
import { UsuarioDTO } from '../../models/usuario'
import { UsuarioService } from '../../service/usuario.service'

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.less']
})
export class UsuariosComponent implements OnInit {

  usuariosDTO : UsuarioDTO[];

  constructor(private usuarioService: UsuarioService) { }

  ngOnInit(): void {
    this.getUsuarios();
  }

  getUsuarios(): void {
    this.usuarioService.getUsuarios().subscribe(usuarios => this.usuariosDTO = usuarios);
  }

  buscar(){
    console.log("buscar");
  }

}
