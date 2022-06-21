package com.escalab.mediappbackend.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;

    @Column(name = "fecha")
    private Date date;

    //JoinColumn sirve para crear una clave foránea
    @ManyToOne
    @JoinColumn(name = "id_paciente", //tiene que ser el mismo id que está en la tabla o entidad Paciente
                nullable = false,
    foreignKey = @ForeignKey(name = "FK_consulta_paciente"))
    private Paciente paciente;// acá indica con que tabla o entidad se va a relacionar

    //JoinColumn sirve para crear una clave foránea
    @ManyToOne
    @JoinColumn(name = "id_medico", //tiene que ser el mismo id que está en la tabla o entidad Paciente
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_medico"))
    private Medico medico;// acá indica con que tabla o entidad se va a relacionar

    //JoinColumn sirve para crear una clave foránea
    @ManyToOne
    @JoinColumn(name = "id_especialidad", //tiene que ser el mismo id que está en la tabla o entidad Paciente
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_especialidad"))
    private Especialidad especialidad;// acá indica con que tabla o entidad se va a relacionar

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
