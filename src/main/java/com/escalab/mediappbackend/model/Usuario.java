package com.escalab.mediappbackend.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "clave")
    private String clave;

    @Column(name = "estado")
    private boolean estado;

    // @ManyToMany y @JoinTable() crean tabla intermedia entre usuario y rol para evitar duplicidad de datos
    // @JoinTable() en vez de declararme una columna, me va a declarar una tabla
    /* Hay otra alternativa al referencedColumnName (crea el nombre automatico de la fk con un monton de caracteres aleatorios del JPA),
       puede ser con @ForeignKey (el fk lo crea con el nombre que le colocamos), las 2 son viables */
    @ManyToMany
    @JoinTable(name = "usuario_rol",
                joinColumns =  @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"),
                inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol"))
    private List<Rol> roles; // en el muchos a muchos sería una lista de roles que pueda tener el usuario

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
