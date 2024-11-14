import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Router } from 'express';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Empleados';
  constructor(private router: Router){}

  listar(){
    this.router.navigate(['listar'])
  }
  nuevo(){
    this.router.navigate(['guardar'])
  }
}
