import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Empleados } from '../../../Entidad/empleados';
import { Router } from 'express';
import { ServidorService } from '../../../Servidor/servidor.service';

@Component({
  selector: 'app-guardar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './guardar.component.html',
  styleUrl: './guardar.component.css'
})
export class GuardarComponent {

  constructor(private router : Router, private service : ServidorService){}

  empleado : Empleados = new Empleados();

  guardar(){
    this.service.guardar(this.empleado).subscribe(()=>{
      this.router.navigate(['listar']);
    });
  }
  cancelar(){
    this.router.navigate(['listar'])
  }
}
