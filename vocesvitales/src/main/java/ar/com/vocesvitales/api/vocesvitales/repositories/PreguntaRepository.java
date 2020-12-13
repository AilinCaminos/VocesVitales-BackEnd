package ar.com.vocesvitales.api.vocesvitales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.vocesvitales.api.vocesvitales.entities.Pregunta;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer>{

    Pregunta findByPreguntaId(Integer preguntaId);
    
}
