import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DipendenteComponent } from './dipendente/dipendente.component';
import { AziendaComponent } from './azienda/azienda.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { DipendenteService } from './dipendente/dipendente-service/dipendente.service';
import { Dipendente } from './dipendente/dipendente-class/dipendente';


@NgModule({
  declarations: [
    AppComponent,
    DipendenteComponent,
    AziendaComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    RouterModule,
    HttpClientModule,
    
  ],
  providers: [Dipendente],
  bootstrap: [AppComponent]
})
export class AppModule { }
function appRoutes(appRoutes: any): any[] | import("@angular/core").Type<any> | import("@angular/core").ModuleWithProviders<{}> {
  throw new Error('Function not implemented.');
}

