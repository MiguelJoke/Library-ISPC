export class Reserva {
  idLibro: number;
  nombreUsuario: string;
  nombreLibro: string;
  autorLibro: string;
  fechaSalida: string;
  fechaPrevistaDevolucion: string;
  constructor(
    idLibro: number,
    nombreUsuario: string,
    nombreLibro: string,
    autorLibro: string,
    fechaSalida: string,
    fechaPrevistaDevolucion: string
  ) {
    this.idLibro = idLibro;
    this.nombreUsuario = nombreUsuario;
    this.nombreLibro = nombreLibro;
    this.autorLibro = autorLibro;
    this.fechaSalida = fechaSalida;
    this.fechaPrevistaDevolucion = fechaPrevistaDevolucion;
  }
}
