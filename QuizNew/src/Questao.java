import java.util.ArrayList;
import java.util.List;

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
        if (this.opcaoE != null && !this.opcaoE.isEmpty()) {
            System.out.println(this.opcaoE);
        }
        System.out.println();
    }
    
    public static List<Questao> criarQuestoes() {
        List<Questao> questoes = new ArrayList<>();

        // Questão 1
        Questao q1 = new Questao();
        q1.pergunta = "1 - Qual é o principal material utilizado na construção de estruturas de concreto?";
        q1.opcaoA = "A - Aço";
        q1.opcaoB = "B - Concreto";
        q1.opcaoC = "C - Madeira";
        q1.opcaoD = "D - Alvenaria";
        q1.correta = "B";
        questoes.add(q1);

        // Questão 2
        Questao q2 = new Questao();
        q2.pergunta = "2 - O que é uma fundação?";
        q2.opcaoA = "A - Parte superior de uma estrutura.";
        q2.opcaoB = "B - Elemento que suporta a carga de uma construção.";
        q2.opcaoC = "C - Material utilizado na construção.";
        q2.opcaoD = "D - Sistema de drenagem.";
        q2.correta = "B";
        questoes.add(q2);

        // Questão 3
        Questao q3 = new Questao();
        q3.pergunta = "3 - Qual é a principal função de um ar comprimido em uma obra?";
        q3.opcaoA = "A - Aumentar a resistência do concreto.";
        q3.opcaoB = "B - Facilitar o transporte de materiais.";
        q3.opcaoC = "C - Utilizar ferramentas pneumáticas.";
        q3.opcaoD = "D - Melhorar a estética da construção.";
        q3.correta = "C";
        questoes.add(q3);

        // Questão 4
        Questao q4 = new Questao();
        q4.pergunta = "4 - O que é um projeto arquitetônico?";
        q4.opcaoA = "A - Desenho técnico da estrutura.";
        q4.opcaoB = "B - Estudo de impacto ambiental.";
        q4.opcaoC = "C - Análise de solo.";
        q4.opcaoD = "D - Planejamento da estética e funcionalidade do espaço.";
        q4.correta = "D";
        questoes.add(q4);

        // Questão 5
        Questao q5 = new Questao();
        q5.pergunta = "5 - Qual é a norma brasileira que regulamenta as estruturas de concreto?";
        q5.opcaoA = "A - NBR 6118";
        q5.opcaoB = "B - NBR 9050";
        q5.opcaoC = "C - NBR 13752";
        q5.opcaoD = "D - NBR 5626";
        q5.correta = "A";
        questoes.add(q5);

        // Questão 6
        Questao q6 = new Questao();
        q6.pergunta = "6 - O que caracteriza uma ponte estaiada?";
        q6.opcaoA = "A - Suporte feito de concreto.";
        q6.opcaoB = "B - Arcos de suporte.";
        q6.opcaoC = "C - Estrutura totalmente em aço.";
        q6.opcaoD = "D - Cabos tensionados que sustentam o tabuleiro.";
        q6.correta = "D";
        questoes.add(q6);

        // Questão 7
        Questao q7 = new Questao();
        q7.pergunta = "7 - Qual é a função de um estudo de solo antes da construção?";
        q7.opcaoA = "A - Determinar o tipo de materiais a serem usados.";
        q7.opcaoB = "B - Planejar o design da edificação.";
        q7.opcaoC = "C - Avaliar a capacidade de carga do terreno.";
        q7.opcaoD = "D - Calcular os custos da obra.";
        q7.correta = "C";
        questoes.add(q7);

        // Questão 8
        Questao q8 = new Questao();
        q8.pergunta = "8 - O que é um projeto de drenagem?";
        q8.opcaoA = "A - Sistema para impermeabilizar estruturas.";
        q8.opcaoB = "B - Planejamento para gerenciar águas pluviais.";
        q8.opcaoC = "C - Estrutura para suportar cargas pesadas.";
        q8.opcaoD = "D - Material de construção.";
        q8.correta = "B";
        questoes.add(q8);

        // Questão 9
        Questao q9 = new Questao();
        q9.pergunta = "9 - Qual destes é um tipo de estrutura de sustentação?";
        q9.opcaoA = "A - Viga.";
        q9.opcaoB = "B - Parede de gesso.";
        q9.opcaoC = "C - Piso de madeira.";
        q9.opcaoD = "D - Teto de telha.";
        q9.correta = "A";
        questoes.add(q9);

        // Questão 10
        Questao q10 = new Questao();
        q10.pergunta = "10 - Qual é a principal causa de falhas em construções?";
        q10.opcaoA = "A - Má escolha de materiais.";
        q10.opcaoB = "B - Falta de mão de obra.";
        q10.opcaoC = "C - Planejamento inadequado.";
        q10.opcaoD = "D - Todas as anteriores.";
        q10.correta = "D";
        questoes.add(q10);

        // Questão 11
        Questao q11 = new Questao();
        q11.pergunta = "11 - O que é uma laje?";
        q11.opcaoA = "A - Um tipo de fundação.";
        q11.opcaoB = "B - Uma superfície horizontal que suporta carga.";
        q11.opcaoC = "C - Um tipo de revestimento.";
        q11.opcaoD = "D - Uma estrutura de suporte vertical.";
        q11.correta = "B";
        questoes.add(q11);

        // Questão 12
        Questao q12 = new Questao();
        q12.pergunta = "12 - Qual é a principal função de um engenheiro civil?";
        q12.opcaoA = "A - Projetar sistemas elétricos.";
        q12.opcaoB = "B - Administrar obras.";
        q12.opcaoC = "C - Construir e projetar infraestruturas.";
        q12.opcaoD = "D - Vender materiais de construção.";
        q12.correta = "C";
        questoes.add(q12);

        // Questão 13
        Questao q13 = new Questao();
        q13.pergunta = "13 - O que é a NBR 15575?";
        q13.opcaoA = "A - Normas de desempenho de edificações habitacionais.";
        q13.opcaoB = "B - Normas de segurança em obras.";
        q13.opcaoC = "C - Normas de resistência de materiais.";
        q13.opcaoD = "D - Normas de acústica.";
        q13.correta = "A";
        questoes.add(q13);

        // Questão 14
        Questao q14 = new Questao();
        q14.pergunta = "14 - Quais são os tipos de fundações?";
        q14.opcaoA = "A - Rasas e profundas.";
        q14.opcaoB = "B - Diretas e indiretas.";
        q14.opcaoC = "C - Superficiais e estruturais.";
        q14.opcaoD = "D - Todas as anteriores.";
        q14.correta = "A";
        questoes.add(q14);

        // Questão 15
        Questao q15 = new Questao();
        q15.pergunta = "15 - Qual é o objetivo de um planejamento de obra?";
        q15.opcaoA = "A - Reduzir custos e otimizar tempo.";
        q15.opcaoB = "B - Definir o design da construção.";
        q15.opcaoC = "C - Escolher o tipo de concreto.";
        q15.opcaoD = "D - Avaliar o impacto ambiental.";
        q15.correta = "A";
        questoes.add(q15);

        return questoes;
    }
}
