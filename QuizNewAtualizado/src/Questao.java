import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeroAcertos = 0;
        System.out.println("=========================================================================");
        System.out.println("UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Goiânia, 20 de setembro de 2024");
        System.out.println("Professor: Brenner");
        System.out.println("Aluno: Wilson Cabral Moreira Neto");
        System.out.println("=========================================================================");

        numeroAcertos = grupoQuestoes();

        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas você acertou: " + numeroAcertos);
    }

    public static int grupoQuestoes() {
        int cont = 0;
        List<Questao> questoes = Questao.criarQuestoes(); // Obtém todas as questões

        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String respostaUsuario = leiaResposta();
            if (questao.isCorreta(respostaUsuario)) {
                cont++;
            }
            System.out.println("=========================================================================");
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
}
