
import { HttpClient } from '@angular/common/http';
import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { Dipendente } from '../dipendente/dipendente-class/dipendente';
import { LoginService } from './login-service/login.service';
import { MatDialog, _closeDialogVia } from '@angular/material/dialog';
import { DialogLoginComponent } from '../dialog-login/dialog-login.component';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private http:HttpClient,private route:Router,public dialog: MatDialog) { }

  ngOnInit(): void {
  }
  lista: Dipendente[] = [];
  
   onSubmit(email: string,password : string){
     
    
    this.http.post<any>("http://localhost:8080/dipendenti/login",{email:email,password:password}).subscribe(data => {
      this.lista = data
      console.log(this.lista.length)
      if(this.lista.length == 1){
        this.route.navigate(['/dipendente'])
       }else{
        this.dialog.open(DialogLoginComponent)
       }
    })
    
   }
 
 
}
