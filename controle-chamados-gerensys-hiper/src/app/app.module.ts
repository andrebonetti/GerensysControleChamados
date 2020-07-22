import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChamadosComponent } from './pages/chamados/chamados.component';
import { FormsModule } from '@angular/forms';
import { ChamadoDetalheComponent } from './pages/chamado-detalhe/chamado-detalhe.component';
import { MensagensComponent } from './mensagens/mensagens.component';
import { HeaderComponent } from './struct/header/header.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { FontAwesomeModule, FaIconLibrary } from '@fortawesome/angular-fontawesome';
import { faSquare, faCheckSquare,faPlusSquare,faAngleRight } from '@fortawesome/free-solid-svg-icons';
import { faSquare as farSquare, faCheckSquare as farCheckSquare, faPlusSquare as farPlusSquare } from '@fortawesome/free-regular-svg-icons';
import { faStackOverflow, faGithub, faMedium } from '@fortawesome/free-brands-svg-icons';
import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { UsuarioCrudComponent } from './pages/usuario-crud/usuario-crud.component';
import { UsuarioPerfisComponent } from './pages/usuario-perfis/usuario-perfis.component';

@NgModule({
  declarations: [
    AppComponent,
    ChamadosComponent,
    ChamadoDetalheComponent,
    MensagensComponent,
    HeaderComponent,
    UsuariosComponent,
    UsuarioCrudComponent,
    UsuarioPerfisComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    NgbModule,
    FontAwesomeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor(private library: FaIconLibrary) {
    library.addIcons(faSquare, faCheckSquare, farSquare,faAngleRight, farCheckSquare,faPlusSquare,farPlusSquare, faStackOverflow, faGithub, faMedium);
  }
}
