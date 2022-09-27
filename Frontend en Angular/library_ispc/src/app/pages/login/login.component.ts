import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})


export class LoginComponent implements OnInit {

  logueo = " ";

  constructor(private http: HttpClient) { }

  ngOnInit(): void {

    //Consumo la Api
    this.http.get('http://localhost:8080/loguin').subscribe((resp:any) =>{
    this.logueo = resp;
    }
    )

  }

}
