import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginUserService } from 'src/app/services/login-user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  validarLogueo: any;
  constructor(
    private http: HttpClient,
    private logueoService: LoginUserService,
    private router: Router
  ) {}

  ngOnInit(): void {}

  logueo(nombreUsuario: string, contra: string) {
    // let datoslogueo = new DatosLoguin(nombreUsuario, contra);
    this.validarLogueo = this.logueoService
      .loguinService(nombreUsuario, contra)
      .subscribe((respuesta) => {
        console.log(respuesta);
        if (respuesta) {
          this.router.navigate(['/home']);
        } else {
          this.router.navigate(['/login']);
        }
        return respuesta;
      });

    if (this.validarLogueo) {
      this.router.navigate(['/home']);
    } else {
      this.router.navigate(['/login']);
    }
  }
}
