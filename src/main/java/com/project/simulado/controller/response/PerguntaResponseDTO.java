package com.project.simulado.controller.response;

import com.project.simulado.model.Alternativas;
import com.project.simulado.model.Materia;
import com.project.simulado.model.Pergunta;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PerguntaResponseDTO {


    private Long _id;
    private String texto;
    private Alternativas alternativas;
    private Boolean respondida;
    private Materia materia;
    private String imagem;

    public PerguntaResponseDTO(Pergunta pergunta) {
        this._id = pergunta.get_id();
        this.texto = pergunta.getTexto();
        this.alternativas = pergunta.getAlternativas();
        this.respondida = pergunta.getRespondida();
        this.materia = pergunta.getMateria();
        this.imagem = pergunta.getImagem();
    }

    public static List<PerguntaResponseDTO> converter(List<Pergunta> perguntas) {
        return perguntas.stream().map(PerguntaResponseDTO::new).collect(Collectors.toList());
    }
}
