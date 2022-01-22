package tech.getarrays.empleadodirector.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import tech.getarrays.empleadodirector.Modelo.empleado;


public interface EmpleadoRepositorio extends JpaRepository<empleado, Long> {
    

    void deleteEmpleadoById(Long id);
    Optional<empleado> findEmpleadoById(Long id);
}
