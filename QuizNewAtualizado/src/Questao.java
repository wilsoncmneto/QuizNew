import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao {
    String pergunta;
    String opcaoA;
    String opcaoB;
    String opcaoC;
    String opcaoD;
    String opcaoE;
    String correta;

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! - Letra: " + this.correta);
            return true;
        } else {
            System.out.println("Resposta errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            return false;
        }
    }

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

//    public static List<Questao> criarQuestoes() {
//        List<Questao> questoes = new ArrayList<>();
//
//        // Questão 1
//        Questao q1 = new Questao();
//        q1.pergunta = "1 - Qual é o principal material utilizado na construção de estruturas de concreto?";
//        q1.opcaoA = "A - Aço";
//        q1.opcaoB = "B - Concreto";
//        q1.opcaoC = "C - Madeira";
//        q1.opcaoD = "D - Alvenaria";
//        q1.opcaoE = "E - Polímeros";
//        q1.correta = "B";
//        questoes.add(q1);
//
//        // Questão 2
//        Questao q2 = new Questao();
//        q2.pergunta = "2 - O que é uma fundação?";
//        q2.opcaoA = "A - Parte superior de uma estrutura.";
//        q2.opcaoB = "B - Elemento que suporta a carga de uma construção.";
//        q2.opcaoC = "C - Material utilizado na construção.";
//        q2.opcaoD = "D - Sistema de drenagem.";
//        q2.opcaoE = "E - Base decorativa de uma estrutura.";
//        q2.correta = "B";
//        questoes.add(q2);
//
//        // Questão 3
//        Questao q3 = new Questao();
//        q3.pergunta = "3 - Qual é a principal função do ar comprimido em uma obra?";
//        q3.opcaoA = "A - Aumentar a resistência do concreto.";
//        q3.opcaoB = "B - Facilitar o transporte de materiais.";
//        q3.opcaoC = "C - Utilizar ferramentas pneumáticas.";
//        q3.opcaoD = "D - Melhorar a estética da construção.";
//        q3.opcaoE = "E - Prover energia para equipamentos pesados.";
//        q3.correta = "C";
//        questoes.add(q3);
//
//        // Questão 4
//        Questao q4 = new Questao();
//        q4.pergunta = "4 - O que é um projeto arquitetônico?";
//        q4.opcaoA = "A - Desenho técnico da estrutura.";
//        q4.opcaoB = "B - Estudo de impacto ambiental.";
//        q4.opcaoC = "C - Análise de solo.";
//        q4.opcaoD = "D - Planejamento da estética e funcionalidade do espaço.";
//        q4.opcaoE = "E - Execução de cálculos estruturais.";
//        q4.correta = "D";
//        questoes.add(q4);
//
//        // Questão 5
//        Questao q5 = new Questao();
//        q5.pergunta = "5 - Qual é a norma brasileira que regulamenta as estruturas de concreto?";
//        q5.opcaoA = "A - NBR 6118";
//        q5.opcaoB = "B - NBR 9050";
//        q5.opcaoC = "C - NBR 13752";
//        q5.opcaoD = "D - NBR 5626";
//        q5.opcaoE = "E - NBR 12345";
//        q5.correta = "A";
//        questoes.add(q5);
//
//        // Questão 6
//        Questao q6 = new Questao();
//        q6.pergunta = "6 - O que caracteriza uma ponte estaiada?";
//        q6.opcaoA = "A - Suporte feito de concreto.";
//        q6.opcaoB = "B - Arcos de suporte.";
//        q6.opcaoC = "C - Estrutura totalmente em aço.";
//        q6.opcaoD = "D - Cabos tensionados que sustentam o tabuleiro.";
//        q6.opcaoE = "E - Estruturas suspensas sem suporte direto.";
//        q6.correta = "D";
//        questoes.add(q6);
//
//        // Questão 7
//        Questao q7 = new Questao();
//        q7.pergunta = "7 - Qual é a função de um estudo de solo antes da construção?";
//        q7.opcaoA = "A - Determinar o tipo de materiais a serem usados.";
//        q7.opcaoB = "B - Planejar o design da edificação.";
//        q7.opcaoC = "C - Avaliar a capacidade de carga do terreno.";
//        q7.opcaoD = "D - Calcular os custos da obra.";
//        q7.opcaoE = "E - Analisar os impactos ambientais.";
//        q7.correta = "C";
//        questoes.add(q7);
//
//        // Questão 8
//        Questao q8 = new Questao();
//        q8.pergunta = "8 - O que é um projeto de drenagem?";
//        q8.opcaoA = "A - Sistema para impermeabilizar estruturas.";
//        q8.opcaoB = "B - Planejamento para gerenciar águas pluviais.";
//        q8.opcaoC = "C - Estrutura para suportar cargas pesadas.";
//        q8.opcaoD = "D - Material de construção.";
//        q8.opcaoE = "E - Sistema para reutilização de água.";
//        q8.correta = "B";
//        questoes.add(q8);
//
//        // Questão 9
//        Questao q9 = new Questao();
//        q9.pergunta = "9 - Qual é a função de uma viga em uma estrutura?";
//        q9.opcaoA = "A - Sustentar as paredes.";
//        q9.opcaoB = "B - Distribuir as cargas para os pilares.";
//        q9.opcaoC = "C - Suportar o peso do telhado.";
//        q9.opcaoD = "D - Melhorar a estética da construção.";
//        q9.opcaoE = "E - Absorver vibrações do solo.";
//        q9.correta = "B";
//        questoes.add(q9);
//
//        // Questão 10
//        Questao q10 = new Questao();
//        q10.pergunta = "10 - O que caracteriza um sistema pré-moldado?";
//        q10.opcaoA = "A - Construção realizada no local.";
//        q10.opcaoB = "B - Estruturas fabricadas em fábrica e montadas no local.";
//        q10.opcaoC = "C - Uso exclusivo de concreto armado.";
//        q10.opcaoD = "D - Estruturas de madeira temporárias.";
//        q10.opcaoE = "E - Processos de construção tradicionais.";
//        q10.correta = "B";
//        questoes.add(q10);
//
//        // Questão 11
//        Questao q11 = new Questao();
//        q11.pergunta = "11 - Qual é o principal objetivo de um cronograma de obras?";
//        q11.opcaoA = "A - Estimar os custos de materiais.";
//        q11.opcaoB = "B - Planejar as etapas da construção e prazos.";
//        q11.opcaoC = "C - Determinar a mão de obra necessária.";
//        q11.opcaoD = "D - Garantir a segurança dos trabalhadores.";
//        q11.opcaoE = "E - Calcular a resistência dos materiais.";
//        q11.correta = "B";
//        questoes.add(q11);
//
//        // Questão 12
//        Questao q12 = new Questao();
//        q12.pergunta = "12 - O que é um projeto estrutural?";
//        q12.opcaoA = "A - Planejamento da estética da construção.";
//        q12.opcaoB = "B - Cálculo das cargas e resistência da edificação.";
//        q12.opcaoC = "C - Sistema de drenagem de águas pluviais.";
//        q12.opcaoD = "D - Levantamento topográfico do terreno.";
//        q12.opcaoE = "E - Desenho decorativo da estrutura.";
//        q12.correta = "B";
//        questoes.add(q12);
//
//        // Questão 13
//        Questao q13 = new Questao();
//        q13.pergunta = "13 - Qual é o papel do mestre de obras em um projeto?";
//        q13.opcaoA = "A - Planejar o orçamento da obra.";
//        q13.opcaoB = "B - Supervisionar a execução dos trabalhos no canteiro.";
//        q13.opcaoC = "C - Elaborar os cálculos estruturais.";
//        q13.opcaoD = "D - Criar o projeto arquitetônico.";
//        q13.opcaoE = "E - Gerenciar a aquisição de terrenos.";
//        q13.correta = "B";
//        questoes.add(q13);
//
//        // Questão 14
//        Questao q14 = new Questao();
//        q14.pergunta = "14 - Qual é a principal característica de um telhado verde?";
//        q14.opcaoA = "A - É feito de concreto reforçado.";
//        q14.opcaoB = "B - Utiliza vegetação em sua cobertura.";
//        q14.opcaoC = "C - É mais leve que telhados tradicionais.";
//        q14.opcaoD = "D - Possui inclinação ajustável.";
//        q14.opcaoE = "E - Reduz os custos de construção.";
//        q14.correta = "B";
//        questoes.add(q14);
//
//        // Questão 15
//        Questao q15 = new Questao();
//        q15.pergunta = "15 - O que é um alicerce?";
//        q15.opcaoA = "A - Estrutura localizada no telhado.";
//        q15.opcaoB = "B - Base de uma construção que distribui as cargas ao solo.";
//        q15.opcaoC = "C - Parte superior de uma viga.";
//        q15.opcaoD = "D - Elemento decorativo de uma fachada.";
//        q15.opcaoE = "E - Sistema de impermeabilização de paredes.";
//        q15.correta = "B";
//        questoes.add(q15);
//
//        return questoes;
//    }
}
