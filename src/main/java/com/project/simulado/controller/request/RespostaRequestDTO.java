package com.project.simulado.controller.request;

import com.project.simulado.model.Pergunta;
import lombok.Data;

@Data
public class RespostaRequestDTO {

    private String resposta;

    public boolean confere(Character respostaCorreta) {
        return respostaCorreta.equals(resposta.charAt(0));
    }
}
