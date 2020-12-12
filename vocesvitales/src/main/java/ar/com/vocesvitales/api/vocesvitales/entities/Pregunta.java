package ar.com.vocesvitales.api.vocesvitales.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_pregunta")
    private Integer preguntaId;
    private String titulo;
    private String descripcion;
    private Respuesta respuesta;

}