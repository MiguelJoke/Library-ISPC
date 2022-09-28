import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Libro } from '../pages/model/Libros';

@Injectable({
  providedIn: 'root',
})
export class ReservasServiceService {
  private url;
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, PUT, POST, DELETE, HEAD, OPTIONS',
    }),
  };

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:8080';
  }

  public obtenerLibrosDisponibles(): Observable<Libro[]> {
    let endpoint = this.url + '/librosdisponibles';
    return this.http.get<Libro[]>(endpoint, this.httpOptions);
  }
}
