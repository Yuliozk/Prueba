import { Component, OnInit } from '@angular/core';
import { Empleados } from '../../../Entidad/empleados';
import { Router } from 'express';
import { ServidorService } from '../../../Servidor/servidor.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-editar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './editar.component.html',
  styleUrl: './editar.component.css'
})
export class EditarComponent implements OnInit {
  empleado : Empleados = new Empleados();

  constructor(private router: Router, private service: ServidorService){}
  ngOnInit(): void {
    this.buscar();
  }

  buscar(){
    let id = localStorage.getItem('idEmpleado');
    this.empleado.idEmpleado = Number(id);
    this.service.obtener(this.empleado.idEmpleado).subscribe(data =>{
      this.empleado = data;
    });
  }

  editar(){
    this.service.editar(this.empleado).subscribe(()=>{
      this.router.navigate(['listar']);
    });
  }
  cancelar(){
    this.router.navigate(['listar']);
  }
}
