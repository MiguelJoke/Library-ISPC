import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { DatosLoguin } from '../pages/model/datosLoguin';
import { Libro } from '../pages/model/Libros';
import { Reserva } from '../pages/model/Reserva';
import { LoginUserService } from './login-user.service';

@Injectable({
  providedIn: 'root',
})
export class ReservasServiceService {
  private url;
  private usuario: DatosLoguin;
  private usu: string;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, HEAD, OPTIONS',
    }),
  };

  constructor(
    private http: HttpClient,
    private usuarioService: LoginUserService,
    private router: Router
  ) {
    this.url = 'http://localhost:8080';
    this.usuario = new DatosLoguin();
    this.usu = '';
  }

  public obtenerLibrosDisponibles(): Observable<Libro[]> {
    let endpoint = this.url + '/librosdisponibles';
    return this.http.get<Libro[]>(endpoint, this.httpOptions);
  }

  public consultarReservasXUsuario(): Observable<Reserva[]> {
    let endpoint =
      this.url +
      '/buscarReservas?usuario=' +
      this.usuarioService.obtenerNombreUsuario();

    return this.http.get<Reserva[]>(endpoint, this.httpOptions);
  }
}
