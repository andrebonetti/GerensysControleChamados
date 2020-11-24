import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChamadosComponent } from './pages/chamados/chamados.component';
import { ChamadoDetalheComponent }  from './pages/chamado-detalhe/chamado-detalhe.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { UsuarioCrudComponent } from './pages/usuario-crud/usuario-crud.component';
import { UsuarioPerfisComponent } from './pages/usuario-perfis/usuario-perfis.component';
import { LoginComponent } from './pages/login/login.component';
import { EmpresasComponent } from './pages/empresas/empresas.component';

const routes: Routes = [
  { path: '', redirectTo: '/chamados', pathMatch: 'full' },
  { path: 'login', component: LoginComponent },
  { path: 'chamados', component: ChamadosComponent },
  { path: 'chamado-detalhe/:id', component: ChamadoDetalheComponent },
  { path: 'chamado-cadastro', component: ChamadoDetalheComponent },
  { path: 'empresas', component: EmpresasComponent },
  { path: 'usuarios', component: UsuariosComponent },
  { path: 'usuario-edicao/:id', component: UsuarioCrudComponent },
  { path: 'usuario-criacao', component: UsuarioCrudComponent },
  { path: 'perfis', component: UsuarioPerfisComponent },
  { path: '**', redirectTo: '/chamados', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
