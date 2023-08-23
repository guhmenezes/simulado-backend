package com.project.simulado.controller.response;

import lombok.Data;

@Data
public class RespostaResponseDTO {

    private Boolean acertou;
    private Character respostaCorreta;

    public RespostaResponseDTO(Boolean acertou, Character respostaCorreta) {
        this.acertou = acertou;
        this.respostaCorreta = respostaCorreta;
    }
}

