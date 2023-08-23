package com.project.simulado.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Pergunta {

    private Long _id;
    private String texto;
    private Alternativas alternativas;
    private Character respostaCorreta;
    private Boolean respondida;
    private Materia materia;
    private String imagem;

    public Pergunta(){
        this.respondida = false;
    }
//    _id: 0,
//    texto: 'Segundo o texto, é correto afirmar que: (Ver texto)',
//    alternativas:
//    {
//        a: "(A) entrevistas gravadas são mais difíceis de serem feitas, não só por exigirem um aparato eletrônico, mas também porque a linguagem empregada pode ser mais coloquial.",
//                b: "(B) pequenos dispositivos disfarçados, como itens de casa ou de vestimenta, e agendas eletrônicas possibilitavam a poucas pessoas uma investigação discreta e eficaz.",
//            c: "(C) a combinação de diferentes tecnologias possibilitou que o jornalismo investigativo mudasse a sua dinâmica de atuação e a forma como os “furos” são conseguidos.",
//            d: "(D)  problema dos perfis falsos e robôs nas redes sociais é grave, por interferirem no poder de decisão das pessoas e por roubarem informações de ordem privada.",
//            e: "(E) há um monitoramento constante dos cidadãos quando estes estão em festas nacionais, visando a uma maior segurança dos que participam dessas comemorações."
//    }
//        ,
//    respostaCorreta: "c",
//    respondida: false,
//    materia: "portugues"

}
