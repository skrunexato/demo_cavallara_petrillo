import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DipendenteService } from './dipendente-service/dipendente.service';
import { Dipendente } from './dipendente-class/dipendente';



@NgModule({
  declarations: [],
  providers: [DipendenteService],
  imports: [
    CommonModule
  ]
})
export class DipendenteModule {

  lista: Dipendente[] = [];

  constructor(private serviceD: DipendenteService) { }

  ngOnInit(): void {

  }

/*  getLista(): Dipendente[]{
    this.serviceD.getDipendenti().subscribe(data=>{ this.lista = data });
    return this.lista;
  }*/


 }
