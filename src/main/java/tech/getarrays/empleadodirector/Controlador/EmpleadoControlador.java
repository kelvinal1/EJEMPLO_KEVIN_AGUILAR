package tech.getarrays.empleadodirector.Controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.empleadodirector.Modelo.empleado;
import tech.getarrays.empleadodirector.Servicios.EmpeladoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/empleado")
public class EmpleadoControlador {
    

    private final EmpeladoService empeladoService;

    public EmpleadoControlador(EmpeladoService empeladoService){
        this.empeladoService=empeladoService;
    }

    @GetMapping("/TEmpleados")
    public ResponseEntity<List<empleado>> ObtenerEmpleados(){
        List<empleado> empleados = empeladoService.ListaEmpleados();
        return new ResponseEntity<>(empleados,HttpStatus.OK);

    } 

    @GetMapping("/buscar/{id}")
    public ResponseEntity<empleado> ObtenerEmpleadoporId(@PathVariable("id") long id){
        empleado empleado = empeladoService.EncontrarPorId(id);
        return new ResponseEntity<>(empleado,HttpStatus.OK);
    } 


    @PostMapping("/AnadirEmpleado")
    public ResponseEntity<empleado> AnadirEmpleado(@RequestBody empleado empleado){
        empleado nuevoEmpleado = empeladoService.AnadirEmpleado(empleado);
        return new ResponseEntity<>(nuevoEmpleado,HttpStatus.CREATED);
    }


    @PutMapping("/EditarEmpleado")
    public ResponseEntity<empleado> EditarEmpleado(@RequestBody empleado empleado){
        empleado actEmpleado = empeladoService.EditarEmpleado(empleado);
        return new ResponseEntity<>(actEmpleado,HttpStatus.OK);
    }


    @DeleteMapping("/EliminarEmpleado/{id}")
    public ResponseEntity<?> EliminarEmpleado(@PathVariable("id") long id){
        empeladoService.BorrarEmpleado(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 

}
