import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DipendenteComponent } from './dipendente/dipendente.component';
import { AziendaComponent } from './azienda/azienda.component';

@NgModule({
  declarations: [
    AppComponent,
    DipendenteComponent,
    AziendaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
