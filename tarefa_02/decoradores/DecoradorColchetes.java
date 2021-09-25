package tarefa_02.decoradores;

import tarefa_02.DecoradorNumber;
import tarefa_02.NumeroBasico;

public class DecoradorColchetes extends DecoradorNumber{
    public DecoradorColchetes(NumeroBasico number){
        super(number);
    }
    @Override
    public void print(String menssagem) {
        this.getNumber().print("["+menssagem+"]");
    }
}
