package com.project.simulado.controller;

import com.project.simulado.controller.request.RespostaRequestDTO;
import com.project.simulado.controller.response.PerguntaResponseDTO;
import com.project.simulado.controller.response.RespostaResponseDTO;
import com.project.simulado.model.Alternativas;
import com.project.simulado.model.Materia;
import com.project.simulado.model.Pergunta;
import com.project.simulado.service.PopulaPerguntas;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class PerguntaController {

    @GetMapping
    public ResponseEntity<?> listar(){
        PopulaPerguntas gerador = new PopulaPerguntas();
        List<Pergunta> perguntas = gerador.getPerguntas();
        return ResponseEntity.ok(PerguntaResponseDTO.converter(perguntas));
    }

    @PostMapping
    public ResponseEntity<?> resetar(){
        return ResponseEntity.ok("resetando");
    }

    @PostMapping("/{id}")
    public ResponseEntity<?> responder(@PathVariable Long id, RespostaRequestDTO resposta){
        PopulaPerguntas gerador = new PopulaPerguntas();
        List<Pergunta> perguntas = gerador.getPerguntas();
        Pergunta pergunta = perguntas.stream().filter(p -> p.get_id() == id).findFirst().get();
        return ResponseEntity.ok(
                new RespostaResponseDTO(pergunta.getRespostaCorreta().equals(resposta.getResposta().charAt(0)), pergunta.getRespostaCorreta().charValue())
        );
    }

}
