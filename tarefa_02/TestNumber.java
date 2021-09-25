package tarefa_02;

import tarefa_02.decoradores.DecoradorChave;
import tarefa_02.decoradores.DecoradorColchetes;
import tarefa_02.decoradores.DecoradorParentese;

public class TestNumber {
    public static void main(String[] args) {
        String numero = "1";
        NumeroBasico numeroBasico = new DecoradorParentese(new Numero());
        numeroBasico.print(numero);
        NumeroBasico numeroBasico2 = new DecoradorColchetes(new DecoradorParentese(new Numero()));
        numeroBasico2.print(numero);
        NumeroBasico numeroBasico3 = new DecoradorChave(new DecoradorColchetes(new DecoradorParentese(new Numero())));
        numeroBasico3.print(numero);
    }
}
