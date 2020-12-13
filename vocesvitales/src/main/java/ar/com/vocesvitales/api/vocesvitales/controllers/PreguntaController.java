package ar.com.vocesvitales.api.vocesvitales.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ar.com.vocesvitales.api.vocesvitales.entities.Pregunta;
import ar.com.vocesvitales.api.vocesvitales.entities.Respuesta;
import ar.com.vocesvitales.api.vocesvitales.models.response.PreguntaResponse;
import ar.com.vocesvitales.api.vocesvitales.repositories.PreguntaRepository;
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

    @GetMapping ("api/v1/pregunta/{id}/respuestas/") 
    public ResponseEntity<List<PreguntaResponse>>getRespuestas( @PathVariable Integer id ){

         Pregunta pregunta = new Pregunta();

         pregunta = preguntaService.findRespuestaPorId(id);

         return (ResponseEntity<List<PreguntaResponse>>) pregunta.getRespuestas();
    }
        

        

         




          

        
      
        

    } 
}
