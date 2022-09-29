import { Component, OnInit } from '@angular/core';
import { ReservasServiceService } from 'src/app/services/reservasService.service';
import { Libro } from '../../model/Libros';

@Component({
  selector: 'app-librosDisponibles',
  templateUrl: './librosDisponibles.component.html',
  styleUrls: ['./librosDisponibles.component.css'],
})
export class LibrosDisponiblesComponent implements OnInit {
  librosDisponibles: Libro[] = [];

  constructor(private reservasService: ReservasServiceService) {}

  ngOnInit() {
    this.traerLibrosDisponibles();
  }

  public traerLibrosDisponibles() {
    return this.reservasService
      .obtenerLibrosDisponibles()
      .subscribe((respuesta) => {
        respuesta.forEach((x) => {
          this.librosDisponibles.push(x);
        });
        console.log(respuesta);
        return respuesta;
      });
  }
}
