import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from 'express';
import { ServidorService } from '../../../Servidor/servidor.service';
import { Empleados } from '../../../Entidad/empleados';

@Component({
  selector: 'app-listar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListarComponent implements OnInit {
  constructor(private router : Router, private service: ServidorService){}

  empleados !: Empleados[];

  ngOnInit(): void {
    this.listar();
  }

  listar(){
    this.service.listar().subscribe(data =>{
      this.empleados = data;
    });
  }
  editar(empleados : Empleados){
    localStorage.setItem('idEmpleado',empleados.idEmpleado.toString());
    this.router.navigate(['editar']);
  }
  eliminar(empleados : Empleados){
    this.service.eliminar(empleados.idEmpleado).subscribe(()=>{
      this.listar();
    });
  }

}
