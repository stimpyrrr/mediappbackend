package com.escalab.mediappbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "paciente")// si no se escribe esta linea, se agregará la tabla a la BD con el nombre de la clase "Paciente"
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//IDENTITY en sql es autoincrementable
    private Integer idPaciente; //id_paciente
    @Column(name = "nombres", length = 70)// si no se escribe esta linea, se agregará la columna a la BD con el nombre de la variable "nombres"
    private String nombres;
    @Column(name = "apellidos", length = 70)
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



    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
