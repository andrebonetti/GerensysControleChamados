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

import { FontAwesomeModule,FaIconLibrary } from '@fortawesome/angular-fontawesome';

import { faSquare,
  faCheckSquare,
  faPlusSquare,
  faAngleRight,
  faAngleLeft,
  faList,
  faGripLinesVertical,
  faCalendarAlt,
  faUser,
  faEdit,
  faTrash,
  faPlus,
  faSearch,
  faEraser,
  faExchangeAlt,
  faSave }
from '@fortawesome/free-solid-svg-icons';
import { faSquare as farSquare,
  faCheckSquare as farCheckSquare,
  faPlusSquare as farPlusSquare,
  faListAlt as farListAlt }
from '@fortawesome/free-regular-svg-icons';
import { faStackOverflow,
  faGithub,
  faMedium,
  faAngellist }
from '@fortawesome/free-brands-svg-icons';

import { UsuariosComponent } from './pages/usuarios/usuarios.component';
import { UsuarioCrudComponent } from './pages/usuario-crud/usuario-crud.component';
import { UsuarioPerfisComponent } from './pages/usuario-perfis/usuario-perfis.component';
import { LoginComponent } from './pages/login/login.component';
import { ChamadosListComponent } from './pages/chamados/chamados-list/chamados-list.component';
import { FilaGridComponent } from './pages/chamados/fila-grid/fila-grid.component';
import { ChamadosFiltroComponent } from './pages/chamados/chamados-filtro/chamados-filtro.component';
import { NgbDatePickerRangeComponent } from './templates/form/ngb-date-picker-range/ngb-date-picker-range.component';
import { InputTextComponent } from './templates/form/input-text/input-text.component';
import { InputSelectComponent } from './templates/form/input-select/input-select.component';
import { UsuarioFiltroComponent } from './pages/usuarios/usuario-filtro/usuario-filtro.component';
import { InputPasswordComponent } from './templates/form/input-password/input-password.component';
import { ToastComponent } from './templates/form/ngb-toast/toast/toast.component';

@NgModule({
  declarations: [
    AppComponent,
    ChamadosComponent,
    ChamadoDetalheComponent,
    MensagensComponent,
    HeaderComponent,
    UsuariosComponent,
    UsuarioCrudComponent,
    UsuarioPerfisComponent,
    LoginComponent,
    ChamadosListComponent,
    FilaGridComponent,
    ChamadosFiltroComponent,
    NgbDatePickerRangeComponent,
    InputTextComponent,
    InputSelectComponent,
    UsuarioFiltroComponent,
    InputPasswordComponent,
    ToastComponent
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
    library.addIcons(faSquare,
      faCheckSquare,
      farSquare,
      faAngleRight,
      farCheckSquare,
      faPlusSquare,
      farPlusSquare,
      faStackOverflow,
      faGithub,
      faMedium,
      faList,
      farListAlt,
      faAngellist,
      faGripLinesVertical,
      faCalendarAlt,
      faUser,
      faEdit,
      faTrash,
      faPlus,
      faSearch,
      faEraser,
      faExchangeAlt,
      faAngleLeft,
      faSave
    );
  }
}
