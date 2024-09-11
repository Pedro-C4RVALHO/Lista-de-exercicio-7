package listas.lista01.aluno;

public class Aluno {
    private int a1, a2, a3, ai;

    public Aluno(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public int pontuacaoFinal() {
        return a1 + a2 + a3;
    }

    public int aplicarAI(int notaAI) {
        this.ai = notaAI;
        if (ai > Math.min(a1, a2)) {
            if (a1 < a2) {
                a1 = ai;
            } else {
                a2 = ai;
            }
        }
        return pontuacaoFinal();
    }

    public int verificarAprovacao() {
        int total = pontuacaoFinal();
        if (total >= 70) return 1;
        int novoTotal = aplicarAI(ai);
        if (novoTotal >= 70) return 2;
        return 3;
    }
}
