import { Component, OnInit } from '@angular/core';
import { LoginUserService } from '../../services/login-user.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  constructor(private servicioLogin: LoginUserService) {}

  ngOnInit(): void {
    this.servicioLogin.validarLogin();
  }
}
