package tech.getarrays.empleadodirector.Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String nombre;
    private String email;
    private String Titulo;
    private String celular;
    private String urlImagen;

    @Column(nullable = false, updatable = false)
    private String codigo_empleado;

    public empleado() {
    }

    public empleado(String nombre, String email, String titulo, String celular, String urlImagen,
            String codigo_empleado) {
        this.nombre = nombre;
        this.email = email;
        Titulo = titulo;
        this.celular = celular;
        this.urlImagen = urlImagen;
        this.codigo_empleado = codigo_empleado;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    @Override
    public String toString() {
        return "empleado [Titulo=" + Titulo + ", celular=" + celular + ", codigo_empleado=" + codigo_empleado
                + ", email=" + email + ", id=" + id + ", nombre=" + nombre + ", urlImagen=" + urlImagen + "]";
    }

}
