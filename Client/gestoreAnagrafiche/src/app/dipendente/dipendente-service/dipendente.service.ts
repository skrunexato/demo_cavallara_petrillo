import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppModule } from 'src/app/app.module';
import { Dipendente } from '../dipendente-class/dipendente';
import { DipendenteComponent } from '../dipendente.component';


@Injectable({
  providedIn: 'root'
})
export class DipendenteService {



  constructor(private http:HttpClient, private dipendenti: Dipendente) { }

  getDipendenti(): Observable<any>{
  return this.http.get("http://localhost:8080/dipendenti/listaDipendenti");
}
}
