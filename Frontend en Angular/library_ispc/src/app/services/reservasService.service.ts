import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Libro } from '../pages/model/Libros';
import { Reserva } from '../pages/model/Reserva';
import { LoginUserService } from './login-user.service';

@Injectable({
  providedIn: 'root',
})
export class ReservasServiceService {
  private url;
  private nombreUsuario: string;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, HEAD, OPTIONS',
    }),
  };

  constructor(
    private http: HttpClient,
    private usuarioService: LoginUserService
  ) {
    this.url = 'http://localhost:8080';
    this.nombreUsuario = this.usuarioService.obtenerNombreUsuario();
    console.log(this.nombreUsuario);
  }

  public obtenerLibrosDisponibles(): Observable<Libro[]> {
    let endpoint = this.url + '/librosdisponibles';
    return this.http.get<Libro[]>(endpoint, this.httpOptions);
  }

  public consultarReservasXUsuario(): Observable<Reserva[]> {
    let endpoint = this.url + '/buscarReservas';

    return this.http.post<Reserva[]>(endpoint, this.nombreUsuario);
  }
}
