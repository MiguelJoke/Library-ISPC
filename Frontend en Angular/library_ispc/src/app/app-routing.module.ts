import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LibrosDisponiblesComponent } from './pages/catalogo/librosDisponibles/librosDisponibles.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'librosDisponibles', component: LibrosDisponiblesComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
