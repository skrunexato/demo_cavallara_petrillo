import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AziendaComponent } from './azienda/azienda.component';
import { DipendenteComponent } from './dipendente/dipendente.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [

  { path: 'dipendente' , component: DipendenteComponent },
  { path: 'azienda', component: AziendaComponent },
  {path :'', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
