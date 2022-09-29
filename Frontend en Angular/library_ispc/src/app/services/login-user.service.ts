import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DatosLoguin } from '../pages/model/datosLoguin';

@Injectable({
  providedIn: 'root',
})
export class LoginUserService {
  private url;
  public nombreUsuario: string = '';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, HEAD, OPTIONS',
      //'Access-Control-Request-Headers': '*',
    }),
  };
  public logueo: boolean;

  constructor(private http: HttpClient, private router: Router) {
    this.url = 'http://localhost:8080';
    this.logueo = false;
  }

  //devuelve todas las aplicaciones
  public loguinService(
    username: string,
    password: string
  ): Observable<boolean> {
    //let usu = new DatosLoguin(username, password);
    this.nombreUsuario = username;
    const formData = new FormData();
    formData.append('username', username);
    formData.append('password', password);

    let loguin = this.url + '/login';

    return this.http.post<boolean>(loguin, formData);
  }

  public obtenerNombreUsuario() {
    return this.nombreUsuario;
  }

  public validarLogin() {
    this.nombreUsuario = this.obtenerNombreUsuario();
    if ((this.nombreUsuario = '')) {
      this.router.navigate(['/login']);
    }
  }
}
