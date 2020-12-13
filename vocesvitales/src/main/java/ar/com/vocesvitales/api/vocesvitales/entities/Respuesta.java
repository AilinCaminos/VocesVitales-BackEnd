package ar.com.vocesvitales.api.vocesvitales.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "respuesta")
public class Respuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "respuesta_id")
    private Integer respuestaId;
    private String descripcion;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pregunta_id", referencedColumnName = "pregunta_id")
    private Pregunta pregunta;

    public Integer getRespuestaId() {
        return respuestaId;
    }

    public void setRespuestaId(Integer respuestaId) {
        this.respuestaId = respuestaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    


    
}