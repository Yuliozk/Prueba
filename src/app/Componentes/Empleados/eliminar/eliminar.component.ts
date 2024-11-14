import { Component } from '@angular/core';
import { Router } from 'express';
import { ServidorService } from '../../../Servidor/servidor.service';
import { Empleados } from '../../../Entidad/empleados';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-eliminar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './eliminar.component.html',
  styleUrl: './eliminar.component.css'
})
export class EliminarComponent {
  constructor(private router : Router, private service : ServidorService){}

  empleado : Empleados = new Empleados();

  eliminar(){
    this.service.guardar(this.empleado).subscribe(()=>{
      this.router.navigate(['listar']);
    });
  }
  cancelar(){
    this.router.navigate(['listar'])
  }
}
