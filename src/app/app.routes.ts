import { Routes } from '@angular/router';
import { ListarComponent } from './Componentes/Empleados/listar/listar.component';
import { GuardarComponent } from './Componentes/Empleados/guardar/guardar.component';
import { EliminarComponent } from './Componentes/Empleados/eliminar/eliminar.component';

export const routes: Routes = [
    {
        path: "listar",
        component: ListarComponent
    },{
      path:"guardar",
      component: GuardarComponent  
    },{
        path:"editar",
        component: GuardarComponent
    },{
        path:"eliminar",
        component: EliminarComponent
    }

];
