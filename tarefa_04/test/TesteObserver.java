package tarefa_04.test;

import tarefa_04.Acao;
import tarefa_04.Corretora;

public class TesteObserver {
    public static void main(String[] args) {
        Acao acao = new Acao("VALE3", 47.20);
        Corretora corretora1 = new Corretora("Xp Investimento");
        Corretora corretora2 = new Corretora("Rico Investimento");
        acao.registraInteressados(corretora1);
        acao.registraInteressados(corretora2);

        acao.setValor(50);

    }
}
