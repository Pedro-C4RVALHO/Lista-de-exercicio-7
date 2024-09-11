package listas.lista01.aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(21, 19, 20);
        System.out.println("Pontuação final: " + aluno.pontuacaoFinal());
        System.out.println("Verificar aprovação: " + aluno.verificarAprovacao());
        System.out.println("Pontuação com AI: " + aluno.aplicarAI(30));
        System.out.println("Verificar aprovação: " + aluno.verificarAprovacao());
    }
}
