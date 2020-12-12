package ar.com.vocesvitales.api.vocesvitales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.vocesvitales.api.vocesvitales.entities.Pregunta;
import ar.com.vocesvitales.api.vocesvitales.repositories.PreguntaRepository;

@Service
public class PreguntaService {

    @Autowired
    PreguntaRepository preguntaRepository;
	public void nuevaPregunta(Pregunta pregunta) {
        
        preguntaRepository.save(pregunta);

	}
    
}
