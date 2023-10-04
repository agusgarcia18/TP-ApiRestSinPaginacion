package com.example.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Autor extends Base{

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "biografia", length = 1500) // La columna recibe hasta 1500 caracteres
    private String biografia;

}
