package com.project.simulado.service;

import com.project.simulado.model.Alternativas;
import com.project.simulado.model.Materia;
import com.project.simulado.model.Pergunta;

import java.util.ArrayList;
import java.util.List;

public class PopulaPerguntas {

    private List<Pergunta> perguntas;
    private Alternativas alternativas;
    private Pergunta pergunta;

    public PopulaPerguntas(){
        perguntas = new ArrayList<>();

        //portugues
        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("entrevistas gravadas são mais difíceis de serem feitas, não só por exigirem um aparato eletrônico, mas também porque a linguagem empregada pode ser mais coloquial.");
        alternativas.setB("pequenos dispositivos disfarçados, como itens de casa ou de vestimenta, e agendas eletrônicas possibilitavam a poucas pessoas uma investigação discreta e eficaz.");
        alternativas.setC("a combinação de diferentes tecnologias possibilitou que o jornalismo investigativo mudasse a sua dinâmica de atuação e a forma como os “furos” são conseguidos.");
        alternativas.setD("problema dos perfis falsos e robôs nas redes sociais é grave, por interferirem no poder de decisão das pessoas e por roubarem informações de ordem privada.");
        alternativas.setE("há um monitoramento constante dos cidadãos quando estes estão em festas nacionais, visando a uma maior segurança dos que participam dessas comemorações.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Segundo o texto, é correto afirmar que: (Ver texto)");
        pergunta.setRespostaCorreta('c');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("as redes sociais concebidas na América do Norte tornaram possível a qualquer cidadão invadir a privacidade alheia e manipular dados inverídicos, fazendo-os parecer verdadeiros.");
        alternativas.setB("o fim do século XIX e o começo do século XX representam o momento de maior efervescência na discussão dos limites da privacidade.");
        alternativas.setC("o material que se encontra escrito nas redes sociais tem menor poder do que a palavra gravada, devido à maior credibilidade do que é registrado em áudio e/ou vídeo.");
        alternativas.setD("estudantes universitários são responsáveis pelos grandes escândalos que estampam as páginas dos jornais, já que são os criadores das redes sociais.");
        alternativas.setE("os smartphones são os responsáveis pelo declínio da privacidade, já que podem enviar para a internet conteúdos que foram capturados pelo próprio aparelho.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("A autora do texto afirma que: (Ver texto)");
        pergunta.setRespostaCorreta('e');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("desejado, mas impossível de ser alcançado.");
        alternativas.setB("relativizado pelas condições em que cada indivíduo se encontra.");
        alternativas.setC("confirmado por evidências empíricas.");
        alternativas.setD("suposto, mas não necessariamente real.");
        alternativas.setE("irreal, mas presente no imaginário das pessoas.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("No último parágrafo, o vocábulo pretensamente, no contexto em que se encontra, dá ideia de algo: (Ver texto)");
        pergunta.setRespostaCorreta('d');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("… que permitiam instalar dispositivos de gravação e filmagem disfarçados de abajures, canetas, óculos e até botões de roupa. (3o parágrafo)");
        alternativas.setB("Um profissional sério desprezava até os gravadores de fita cassete, que em geral intimidavam os entrevistados. (2o parágrafo)");
        alternativas.setC("Por meio das redes, a indústria e o comércio sabem o que mais consumimos, presidentes são eleitos e derrubados… (6o parágrafo)");
        alternativas.setD("Houve um tempo em que o jornalismo investigativo vivia de entrevistas confidenciais que pessoas bem informadas… (1o parágrafo)");
        alternativas.setE("Começava, nesse momento, a grande derrocada da privacidade como a conhecemos um dia. (4o parágrafo)");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Em destaque, encontra-se vocábulo empregado em sentido figurado em: (Ver texto)");
        pergunta.setRespostaCorreta('e');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("Para se preservar, pessoas públicas - da política ou das artes -, falam “em off” com jornalistas.");
        alternativas.setB("Antes a vida alheia era exposta nas praças; hoje os meios são outros: as redes sociais.");
        alternativas.setC("A indústria e o comércio, sobretudo o on-line rastreiam nossas atividades para venderem mais.");
        alternativas.setD("É, por intermédio da imprensa, que, hoje temos acesso ao que de fato acontece no mundo.");
        alternativas.setE("Precisamos nos questionar diariamente: se o que fazemos on-line está protegido?");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Assinale a alternativa que está em conformidade com a norma-padrão da língua quanto à pontuação. (Ver texto)");
        pergunta.setRespostaCorreta('b');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("Os grandes furos nasciam de conversas, e os informantes eram quem os providenciava.");
        alternativas.setB("Além de medir bem a palavra gravada, o profissional adequadamente calcula-a.");
        alternativas.setC("As pessoas com seus pecados, muitos ou poucos, os levam para a internet, os tornando públicos.");
        alternativas.setD("Jornalistas sérios conheciam os gravadores de fita cassete, mas desprezavam-o.");
        alternativas.setE("A privacidade começou a decair e não lhe protegem por causa dos interesses escusos.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Encontra-se em conformidade com a norma-padrão da língua, quanto ao emprego e à colocação dos pronomes,a seguinte frase: (Ver texto)");
        pergunta.setRespostaCorreta('a');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("por");
        alternativas.setB("do");
        alternativas.setC("via");
        alternativas.setD("para");
        alternativas.setE("entre");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Considere a seguinte passagem do texto:“A primeira rede social via internet nos moldes atuais, a Classmates, surgiu em 1995, nos Estados Unidos e Canadá. Era voltada para a troca de informações entre estudantes universitários. Desde então, as redes se multiplicaram e acabaram por se transformar nos principais polos de disseminação de informação do planeta.” (5o parágrafo) Nesse trecho, o vocábulo que expressa sentido de meio é: (Ver texto)");
        pergunta.setRespostaCorreta('c');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("da relação que há entre a curiosidade e o fato de a mente masculina ser mais propensa a desvendar o que está por trás do funcionamento das coisas.");
        alternativas.setB("da tentativa de realização de um experimento sem fundamento, como tudo o que é feito na Ciência, e que acidentalmente pode levar a alguma descoberta.");
        alternativas.setC("da necessidade de provar para alguém que na Ciência está a resposta para todos os questionamentos que a humanidade possa ter.");
        alternativas.setD("da provocação argumentativa feita por Calvin, a qual tem o objetivo de mudar a maneira como a garota entende a anatomia humana.");
        alternativas.setE("de uma hipótese que Calvin tem sobre algo que acredita ser possível e que pretende comprovar se valendo de um experimento.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("A ”mente científica”, anunciada no 1o quadro, fica representada na tira por meio: (Ver tira)");
        pergunta.setRespostaCorreta('e');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("apesar de … repudiar … partiu");
        alternativas.setB("ainda que … se contrariou … ficara");
        alternativas.setC("como … se certificou … teria dado as costas");
        alternativas.setD("já que … não gostou … foi embora");
        alternativas.setE("embora … tenha se convencido … saiu");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Assinale a alternativa que completa corretamente a frase a seguir, segundo norma-padrão da língua portuguesa e as ideias presentes no texto: (Ver tira)\n" +
                "        No último quadro, _______ a garota ________ do que Calvin propunha, ela _________, irritada.");
        pergunta.setRespostaCorreta('d');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("Tem crescido o número de pais e filhos que visitam às feiras de ciências nas grandes cidades.");
        alternativas.setB("Experiências científicas, infelizmente, estão limitadas às escolas que podem pagar por elas.");
        alternativas.setC("De diretores de escola à professores, todos precisam se envolver nas atividades escolares.");
        alternativas.setD("Crianças não estão acostumadas à ver os fatos científicos que estão no cotidiano delas.");
        alternativas.setE("Graças à um interesse maior pela ciência, tem sido possível incentivar experimentos na escola.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.portugues);
        pergunta.setTexto("Quanto ao emprego do acento indicativo de crase, assinale a alternativa que apresenta frase em conformidade com a norma-padrão da língua portuguesa: (Ver tira)");
        pergunta.setRespostaCorreta('b');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("3/16");
        alternativas.setB("5/16");
        alternativas.setC("1/16");
        alternativas.setD("1/8");
        alternativas.setE("1/4");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.matematica);
        pergunta.setTexto("Em uma escola, há um total de 800 alunos, dos quais, estão na educação infantil. Entre os demais alunos, 350 estão no ensino fundamental, e os alunos restantes, no ensino médio. Em relação ao número total de alunos dessa escola, aqueles que estão no ensino médio representam:");
        pergunta.setRespostaCorreta('a');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("22");
        alternativas.setB("36");
        alternativas.setC("28");
        alternativas.setD("32");
        alternativas.setE("18");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.matematica);
        pergunta.setTexto("Foi feito um levantamento com determinado número de alunos para saber qual o vegetal que eles mais gostam de comer no almoço. O gráfico a seguir apresenta alguns dos resultados obtidos. <img> Sabendo-se que cada aluno escolheu apenas um vegetal de sua preferência e que 18 alunos disseram preferir cenoura, então o número de alunos que preferem batata supera o número de alunos que preferem brócolis em:");
        pergunta.setRespostaCorreta('e');
        pergunta.setImagem("img/imagem1.png");
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("5 horas e 05 minutos.");
        alternativas.setB("4 horas e 55 minutos.");
        alternativas.setC("4 horas e 45 minutos.");
        alternativas.setD("5 horas e 25 minutos.");
        alternativas.setE("5 horas e 15 minutos.");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.matematica);
        pergunta.setTexto("Uma professora precisa organizar as pastas de trabalhos de seus alunos. Considerando que essa professora leva 35 minutos para organizar 3 pastas, então o tempo que ela levará para organizar as 27 pastas de seus alunos é de:");
        pergunta.setRespostaCorreta('e');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("106");
        alternativas.setB("88");
        alternativas.setC("94");
        alternativas.setD("112");
        alternativas.setE("100");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.matematica);
        pergunta.setTexto("Em uma caixa, há vários lápis de cor, que serão distribuídos entre os alunos de uma sala, de modo que cada aluno receberá o mesmo número de lápis. Se forem distribuídos 5 lápis para cada aluno, restarão 14 lápis na caixa, porém não será possível distribuir 7 lápis para cada aluno, pois nesse caso ficariam faltando 18 lápis. O número de lápis que há na caixa é:");
        pergunta.setRespostaCorreta('c');
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

        alternativas = new Alternativas();
        pergunta = new Pergunta();
        alternativas.setA("3200 cm²");
        alternativas.setB("2400 cm²");
        alternativas.setC("3000 cm²");
        alternativas.setD("2800 cm²");
        alternativas.setE("2600 cm²");
        pergunta.set_id((long) perguntas.size());
        pergunta.setMateria(Materia.matematica);
        pergunta.setTexto("Uma folha de papelão retangular ABCD, foi recortada em dois pedaços, ambos retangulares, conforme mostra a figura. <img> Se o perímetro do pedaço II é 340 cm, então a área do pedaço I é igual a:");
        pergunta.setRespostaCorreta('b');
        pergunta.setImagem("img/imagem2.png");
        pergunta.setAlternativas(alternativas);

        perguntas.add(pergunta);

//        alternativas = new Alternativas();
//        pergunta = new Pergunta();
//        alternativas.setA("");
//        alternativas.setB("");
//        alternativas.setC("");
//        alternativas.setD("");
//        alternativas.setE("");
//        pergunta.set_id((long) perguntas.size());
//        pergunta.setMateria(Materia.portugues);
//        pergunta.setTexto("");
//        pergunta.setRespostaCorreta('');
//        pergunta.setAlternativas(alternativas);
//
//        perguntas.add(pergunta);

        //texto
        pergunta = new Pergunta();
        pergunta.set_id((long) perguntas.size());
        pergunta.setTexto("Houve um tempo em que o jornalismo investigativo vivia de entrevistas confidenciais que pessoas bem informadas sobre algum assunto de interesse davam a repórteres em que confiavam, em troca de não terem sua identidade revelada.Eram tempos em que uma caneta, um bloquinho e uma agenda de telefones privilegiada constituíam todo o básico de investigação de qualquer jornalista. Um profissional sério desprezava até os gravadores de fita cassete, que, em geral, intimidavam os entrevistados. A palavra gravada precisava ser cuidadosamente medida e calculada. Em off, a conversa corria mais solta. Assim nasciam os grandes furos.Por óbvio, naquele tempo já havia pequenos aparelhos desenvolvidos pelas agências de espionagem internacionais que permitiam instalar dispositivos de gravação e filmagem disfarçados de abajures, canetas, óculos e até botões de roupa. Nada disso, porém, era de fácil acesso às pessoas comuns - o que só mudaria com o advento dos smartphones, a partir do final da década de 1990.A cumplicidade entre internet e dispositivos móveis de captação de som, imagem e informação, com a possibilidade de retransmissão instantânea do material captado, alterou de vez a relação entre o homem moderno e seu ambiente social. Começava, nesse momento, a grande derrocada da privacidade como a conhecemos um dia.A primeira rede social via internet nos moldes atuais, a Classmates, surgiu em 1995, nos Estados Unidos e Canadá. Era voltada para a troca de informações entre estudantes universitários. Desde então, as redes se multiplicaram e acabaram por se transformar nos principais polos de disseminação de informação do planeta. A maior rede disponível hoje, o Facebook, foi criada em 2004 por estudantes de Harvard e reúne mais de 2,2 bilhões de usuários, entre pessoas reais, perfis falsos e robôs.Por meio das redes, a indústria e o comércio sabem o que mais consumimos, presidentes são eleitos e derrubados, e os pecados que gostaríamos de ver escondidos são tornados públicos. O onipresente olho nos acompanha a cada passo que damos, reconhecendo-nos quando circulamos, pretensamente anônimos, em meio às multidões dos blocos carnavalescos.");

        perguntas.add(pergunta);
    }

    public List<Pergunta> getPerguntas() {
        return perguntas;
    }
}
