import { Component, OnInit } from '@angular/core';
import { Dipendente } from './dipendente-class/dipendente';
import { DipendenteService } from './dipendente-service/dipendente.service';

@Component({
  selector: 'dipendente',
  providers: [DipendenteService],
  templateUrl: './dipendente.component.html',
  styleUrls: ['./dipendente.component.css']
})
export class DipendenteComponent implements OnInit {


   lista: Dipendente[] = [];

  constructor(private service: DipendenteService) { }

  ngOnInit(): void {
    this.service.getDipendenti().subscribe(data=>{
      console.log(data)
      this.lista = data});
  }

}
