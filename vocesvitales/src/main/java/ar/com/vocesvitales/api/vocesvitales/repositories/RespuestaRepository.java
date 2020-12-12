package ar.com.vocesvitales.api.vocesvitales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.vocesvitales.api.vocesvitales.entities.Respuesta;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Integer>{
    
}
