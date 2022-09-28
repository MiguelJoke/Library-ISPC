import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { DatosLoguin } from '../pages/model/datosLoguin';

@Injectable({
  providedIn: 'root',
})
export class LoginUserService {
  private url;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, HEAD, OPTIONS',
    }),
  };
  public logueo: boolean;

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080';
    this.logueo = false;
  }

  //devuelve todas las aplicaciones
  public loguinService(
    nombreUsuario: string,
    contrasenia: string
  ): Observable<boolean> {
    const formData = new FormData();
    formData.append('username', nombreUsuario);
    formData.append('password', contrasenia);
    let loguin = this.url + '/loguin';
    //let parametros = ;

    return this.http.post<boolean>(loguin, formData);
  }
}
