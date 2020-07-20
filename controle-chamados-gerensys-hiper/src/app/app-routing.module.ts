import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChamadosComponent } from './pages/chamados/chamados.component';
import { ChamadoDetalheComponent }  from './pages/chamado-detalhe/chamado-detalhe.component';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';

const routes: Routes = [
  { path: '', redirectTo: '/chamados', pathMatch: 'full' },
  { path: 'chamados', component: ChamadosComponent },
  { path: 'chamado-detalhe/:id', component: ChamadoDetalheComponent },
  { path: 'chamado-cadastro', component: ChamadoDetalheComponent },
  { path: 'usuarios', component: UsuariosComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
