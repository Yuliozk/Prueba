import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Empleados } from '../Entidad/empleados';

@Injectable({
  providedIn: 'root'
})
export class ServidorService {

  constructor(private http: HttpClient) { }

  url = 'http://localhost:8010';

  
  listar(){
    return this.http.get<Empleados[]>(this.url+"/Empleados");
  }
  
  guardar(empleado : Empleados){
    return this.http.post<Empleados>(this.url+"/Empleados",empleado);
  }
  
  obtener(idEmpleado : number){
    return this.http.get<Empleados>(`${this.url}/Empleados/${idEmpleado}`);
  }
  
  editar(empleado : Empleados){
    return this.http.put<Empleados>(this.url+"/Empleados",empleado);
  }

  eliminar(idEmpleado : number){
    return this.http.delete<any>(`${this.url}/Empleados/${idEmpleado}`);
  }
}
