package com.escalab.mediappbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")// si no se escribe esta linea, se agregará la tabla a la BD con el nombre de la clase "Paciente"
public class Paciente {

    @Column(name = "nombres")// si no se escribe esta linea, se agregará la columna a la BD con el nombre de la variable "nombres"
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "dni")
    private String dni;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "email")
    private String email;

    //@Column(name = "orden_compra)
    //private String purchasedOrder; //la bd me lo reconocerá como purchased_order (Camel Case)

}
