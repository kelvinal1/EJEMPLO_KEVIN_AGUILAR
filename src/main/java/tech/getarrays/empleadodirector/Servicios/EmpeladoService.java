package tech.getarrays.empleadodirector.Servicios;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.empleadodirector.Exceptions.UserNotFoundException;
import tech.getarrays.empleadodirector.Modelo.empleado;
import tech.getarrays.empleadodirector.Repositorio.EmpleadoRepositorio;

@Service
public class EmpeladoService {

   
    private final EmpleadoRepositorio empleadoRepositorio;

    @Autowired
    public EmpeladoService(EmpleadoRepositorio empleadoRepositorio){
        this.empleadoRepositorio= empleadoRepositorio;
    }



    public empleado AnadirEmpleado(empleado empleado){
        empleado.setCelular(UUID.randomUUID().toString());    
        return empleadoRepositorio.save(empleado);
    }



    public List<empleado> ListaEmpleados(){
        return empleadoRepositorio.findAll();
    }


    public empleado EditarEmpleado(empleado empleado){
        return empleadoRepositorio.save(empleado);
    }


    public empleado EncontrarPorId(Long id){
        return empleadoRepositorio.findEmpleadoById(id).orElseThrow(() -> new UserNotFoundException ("Usuario con id: "+id+" no fue encontrado"));
    }

    public void BorrarEmpleado(Long id){
        empleadoRepositorio.deleteEmpleadoById(id);;
    }

    
    
}
