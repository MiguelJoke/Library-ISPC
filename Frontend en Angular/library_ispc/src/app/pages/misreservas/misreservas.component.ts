import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { LoginUserService } from 'src/app/services/login-user.service';
import { ReservasServiceService } from 'src/app/services/reservasService.service';
import { Reserva } from '../model/Reserva';

@Component({
  selector: 'misreservas',
  templateUrl: './misreservas.component.html',
  styleUrls: ['./misreservas.component.css'],
})
export class MisreservasComponent implements OnInit {
  listaReservas: Reserva[] = [];
  private nombreUsuario: string = '';

  constructor(
    private reservasService: ReservasServiceService,
    private usuarioService: LoginUserService
  ) {}

  ngOnInit(): void {
    this.usuarioService.validarLogin();
    this.traerReservasDelUsuario();
  }

  public traerReservasDelUsuario() {
    return this.reservasService
      .consultarReservasXUsuario()
      .subscribe((respuesta) => {
        respuesta.forEach((x) => {
          this.listaReservas.push(x);
        });
        return respuesta;
      });
  }
}
