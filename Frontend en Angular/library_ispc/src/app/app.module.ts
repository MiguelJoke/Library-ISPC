import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { FooterComponent } from './components/footer/footer.component';
import { HeaderComponent } from './components/header/header.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './pages/home/home.component';
import { CommonModule } from '@angular/common';
import { LibrosDisponiblesComponent } from './pages/catalogo/librosDisponibles/librosDisponibles.component';
import { NosotrosComponent } from './pages/nosotros/nosotros.component';
import { MisreservasComponent } from './pages/misreservas/misreservas.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'home', component: HomeComponent },
  { path: 'nosotros', component: NosotrosComponent},
  { path: 'misreservas', component: MisreservasComponent},
];

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    HomeComponent,
    LibrosDisponiblesComponent,
    NosotrosComponent,
    MisreservasComponent,
  ],
  imports: [
    BrowserModule,
    CommonModule,
    AppRoutingModule,
    [RouterModule.forRoot(routes)],
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [RouterModule],
})
export class AppModule {}
