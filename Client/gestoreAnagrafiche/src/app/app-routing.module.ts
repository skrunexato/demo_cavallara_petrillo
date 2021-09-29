import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AziendaComponent } from './azienda/azienda.component';
import { DipendenteComponent } from './dipendente/dipendente.component';

const routes: Routes = [

  { path: 'dipendente' , component: DipendenteComponent },
  { path: 'azienda', component: AziendaComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
