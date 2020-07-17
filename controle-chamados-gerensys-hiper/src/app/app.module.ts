import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChamadosComponent } from './chamados/chamados.component';
import { FormsModule } from '@angular/forms';
import { ChamadoDetalheComponent } from './chamado-detalhe/chamado-detalhe.component';
import { MensagensComponent } from './mensagens/mensagens.component';
import { HeaderComponent } from './struct/header/header.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

@NgModule({
  declarations: [
    AppComponent,
    ChamadosComponent,
    ChamadoDetalheComponent,
    MensagensComponent,
    HeaderComponent
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
export class AppModule { }
