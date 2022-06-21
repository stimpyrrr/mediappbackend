package com.escalab.mediappbackend.model;

import javax.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//IDENTITY en sql es autoincrementable
    private Integer idMedico; //id_medico

    @Column(name = "nombres", length = 70)
    private String nombres;

    @Column(name = "apellidos", length = 70)
    private String apellidos;

    @Column(name = "cmp", length = 70)
    private String cmp;

    @Column(name = "fotoUrl", length = 70)
    private String fotoUrl;

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

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

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
}
