import java.util.*;
import java.lang.*;

class QuizNew {
    public static void main(String[] args) throws java.lang.Exception {
        int numeroAcertos = 0;
        System.out.println("=====================================");
        System.out.println("UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Goiania, 20 de setembro de 2024");
        System.out.println("Professor:Brenner");
        System.out.println("Alunos:Wilson Cabral Moreira Neto");
        System.out.println("=====================================");

        numeroAcertos = numeroAcertos + grupo2();

        System.out.println("Fim do Quiz!  Parabéns... De 15 perguntas vc acertou: " + numeroAcertos);
    }

    public static int grupo2() {
        int cont = 0;
        String respostaUsuario = "";
        Questao questao1 = new Questao();
        questao1.pergunta = "1 - Qual é o principal material utilizado na construção de estruturas de concreto?:";
        questao1.opcaoA = "A - Aço ";
        questao1.opcaoB = "B - Concreto ";
        questao1.opcaoC = "C - Madeira ";
        questao1.opcaoD = "D - Alvenaria ";
        questao1.correta = "B";
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario2 = "";
        Questao questao2 = new Questao();
        questao2.pergunta = "2 - O que é uma fundação? ";
        questao2.opcaoA = "A - Parte superior de uma estrutura. ";
        questao2.opcaoB = "B - Elemento que suporta a carga de uma construção. ";
        questao2.opcaoC = "C - Material utilizado na construção. ";
        questao2.opcaoD = "D - Sistema de drenagem. ";
        questao2.correta = "B";
        questao2.escrevaQuestao();
        respostaUsuario2 = leiaResposta();
        if (questao2.isCorreta(respostaUsuario2)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario3 = "";
        Questao questao3 = new Questao();
        questao3.pergunta = "3 - Qual é a principal função de um ar comprimido em uma obra? ";
        questao3.opcaoA = "A - Aumentar a resistência do concreto. ";
        questao3.opcaoB = "B - Facilitar o transporte de materiais. ";
        questao3.opcaoC = "C - Utilizar ferramentas pneumáticas. ";
        questao3.opcaoD = "D - Melhorar a estética da construção. ";
        questao3.correta = "C";
        questao3.escrevaQuestao();
        respostaUsuario3 = leiaResposta();
        if (questao3.isCorreta(respostaUsuario3)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario4 = "";
        Questao questao4 = new Questao();
        questao4.pergunta = "4 - O que é um projeto arquitetônico? ";
        questao4.opcaoA = "A - Desenho técnico da estrutura ";
        questao4.opcaoB = "B - Estudo de impacto ambiental ";
        questao4.opcaoC = "C - Análise de solo ";
        questao4.opcaoD = "D - Planejamento da estética e funcionalidade do espaço ";
        questao4.correta = "D";
        questao4.escrevaQuestao();
        respostaUsuario4 = leiaResposta();
        if (questao4.isCorreta(respostaUsuario4)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario5 = "";
        Questao questao5 = new Questao();
        questao5.pergunta = "5 - Qual é a norma brasileira que regulamenta as estruturas de concreto? ";
        questao5.opcaoA = "A - NBR 6118 ";
        questao5.opcaoB = "B - NBR 9050 ";
        questao5.opcaoC = "C - NBR 13752 ";
        questao5.opcaoD = "D - NBR 5626 ";
        questao5.correta = "A";
        questao5.escrevaQuestao();
        respostaUsuario5 = leiaResposta();
        if (questao5.isCorreta(respostaUsuario5)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario6 = "";
        Questao questao6 = new Questao();
        questao6.pergunta = "6 - O que caracteriza uma ponte estaiada? ";
        questao6.opcaoA = "A - Suporte feito de concreto. ";
        questao6.opcaoB = "B - Arcos de suporte. ";
        questao6.opcaoC = "C - Estrutura totalmente em aço. ";
        questao6.opcaoD = "D -  Cabos tensionados que sustentam o tabuleiro. ";
        questao6.correta = "D";
        questao6.escrevaQuestao();
        respostaUsuario6 = leiaResposta();
        if (questao6.isCorreta(respostaUsuario6)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario7 = "";
        Questao questao7 = new Questao();
        questao7.pergunta = "7 - Qual é a função de um estudo de solo antes da construção? ";
        questao7.opcaoA = "A - Determinar o tipo de materiais a serem usados";
        questao7.opcaoB = "B - Planejar o design da edificação";
        questao7.opcaoC = "C - Avaliar a capacidade de carga do terreno";
        questao7.opcaoD = "D - Calcular os custos da obra";
        questao7.correta = "C";
        questao7.escrevaQuestao();
        respostaUsuario7 = leiaResposta();
        if (questao7.isCorreta(respostaUsuario7)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario8 = "";
        Questao questao8 = new Questao();
        questao8.pergunta = "8 - O que é um projeto de drenagem? ";
        questao8.opcaoA = "A - Sistema para impermeabilizar estruturas ";
        questao8.opcaoB = "B - Planejamento para gerenciar águas pluviais ";
        questao8.opcaoC = "C - Estrutura para suportar cargas pesadas ";
        questao8.opcaoD = "D - Material de construção ";
        questao8.correta = "B";
        questao8.escrevaQuestao();
        respostaUsuario8 = leiaResposta();
        if (questao8.isCorreta(respostaUsuario8)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario9 = "";
        Questao questao9 = new Questao();
        questao9.pergunta = "9 - Qual destes é um tipo de estrutura de sustentação? ";
        questao9.opcaoA = "A - Viga";
        questao9.opcaoB = "B - Parede de gesso";
        questao9.opcaoC = "C - Piso de madeira";
        questao9.opcaoD = "D - Teto de telha";
        questao9.correta = "A";
        questao9.escrevaQuestao();
        respostaUsuario9 = leiaResposta();
        if (questao9.isCorreta(respostaUsuario9)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario10 = "";
        Questao questao10 = new Questao();
        questao10.pergunta = "10 - Qual é a principal causa de falhas em construções? ";
        questao10.opcaoA = "A - Má escolha de materiais";
        questao10.opcaoB = "B - Falta de mão de obra";
        questao10.opcaoC = "C - Planejamento inadequado";
        questao10.opcaoD = "D - Todas as anteriores";
        questao10.correta = "D";
        questao10.escrevaQuestao();
        respostaUsuario10 = leiaResposta();
        if (questao10.isCorreta(respostaUsuario10)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario11 = "";
        Questao questao11 = new Questao();
        questao11.pergunta = "11 - O que é um laje? ";
        questao11.opcaoA = "A - Um tipo de fundação";
        questao11.opcaoB = "B - Uma superfície horizontal que suporta carga";
        questao11.opcaoC = "C - Um tipo de revestimento";
        questao11.opcaoD = "D - Uma estrutura de suporte vertical";
        questao11.correta = "B";
        questao11.escrevaQuestao();
        respostaUsuario11 = leiaResposta();
        if (questao11.isCorreta(respostaUsuario11)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario12 = "";
        Questao questao12 = new Questao();
        questao12.pergunta = "12 - Qual é a principal função de um engenheiro civil? ";
        questao12.opcaoA = "A - Projetar sistemas elétricos";
        questao12.opcaoB = "B - Administrar obras";
        questao12.opcaoC = "C - Construir e projetar infraestruturas";
        questao12.opcaoD = "D - Vender materiais de construção";
        questao12.correta = "C";
        questao12.escrevaQuestao();
        respostaUsuario12 = leiaResposta();
        if (questao12.isCorreta(respostaUsuario12)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario13 = "";
        Questao questao13 = new Questao();
        questao13.pergunta = "13 - O que é a NBR 15575? ";
        questao13.opcaoA = "A - Normas de desempenho de edificações habitacionais";
        questao13.opcaoB = "B - Normas de segurança em obras";
        questao13.opcaoC = "C - Normas de resistência de materiais";
        questao13.opcaoD = "D - Normas de acústica";
        questao13.correta = "A";
        questao13.escrevaQuestao();
        respostaUsuario13 = leiaResposta();
        if (questao13.isCorreta(respostaUsuario13)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario14 = "";
        Questao questao14 = new Questao();
        questao14.pergunta = "14 - Quais são os tipos de fundações? ";
        questao14.opcaoA = "A - Rasas e profundas";
        questao14.opcaoB = "B - Diretas e indiretas";
        questao14.opcaoC = "C - Superficiais e estruturais";
        questao14.opcaoD = "D - Todas as anteriores";
        questao14.correta = "D";
        questao14.escrevaQuestao();
        respostaUsuario14 = leiaResposta();
        if (questao14.isCorreta(respostaUsuario14)) {
            cont++;
        }

        System.out.println("=========================================================================");

        String respostaUsuario15 = "";
        Questao questao15 = new Questao();
        questao15.pergunta = "15 - Qual é o objetivo de um planejamento de obra? ";
        questao15.opcaoA = "A - Reduzir custos e otimizar tempo";
        questao15.opcaoB = "B - Definir o design da construção";
        questao15.opcaoC = "C - Escolher os materiais";
        questao15.opcaoD = "D - Aumentar o número de trabalhadores";
        questao15.correta = "A";
        questao15.escrevaQuestao();
        respostaUsuario15 = leiaResposta();
        if (questao15.isCorreta(respostaUsuario15)) {
            cont++;
        }

        return cont;

    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }
    }
}



