package org.esfe.modelos;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "El nombre rol es requerido")
    private String nombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank(message = "El nombre rol es requerido") String getNombre() {
        return nombre;
    }

    public void setNombre(@NotBlank(message = "El nombre rol es requerido") String nombre) {
        this.nombre = nombre;
    }
}