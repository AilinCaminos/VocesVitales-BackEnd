package ar.com.vocesvitales.api.vocesvitales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.vocesvitales.api.vocesvitales.entities.Pregunta;
import ar.com.vocesvitales.api.vocesvitales.models.response.PreguntaResponse;
import ar.com.vocesvitales.api.vocesvitales.services.PreguntaService;

@RestController
public class PreguntaController {
    
    @Autowired
    PreguntaService preguntaService;

    @PostMapping("/api/v1/pregunta")
    public ResponseEntity<PreguntaResponse> postPregunta(@RequestBody Pregunta pregunta){
        
        preguntaService.nuevaPregunta(pregunta);

        PreguntaResponse p = new PreguntaResponse();
        p.id = pregunta.getPreguntaId();

        return ResponseEntity.ok(p);
        
    }
}
