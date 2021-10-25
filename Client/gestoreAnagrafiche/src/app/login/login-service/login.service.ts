import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Dipendente } from 'src/app/dipendente/dipendente-class/dipendente';
import { Login } from '../login-class/login';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient, private login:Login) { }
  lista: Dipendente[] = [];
 /* loginService(email: string,password : string){
    var flagLogin = false;
    console.log("sono dentro")
   this.http.post<any>("http://localhost:8080/dipendenti/login",{username:email,password:password}).subscribe(data => {
     this.lista = data
   })
   if(this.lista.length == 1){
    flagLogin = true
   }
   return flagLogin;
  }*/
}
