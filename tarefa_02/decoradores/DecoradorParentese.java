package tarefa_02.decoradores;

import tarefa_02.DecoradorNumber;
import tarefa_02.NumeroBasico;

public class DecoradorParentese extends DecoradorNumber{
    public DecoradorParentese(NumeroBasico number){
        super(number);
    }
    @Override
    public void print(String menssagem) {
        this.getNumber().print("("+menssagem+")");
    }
}
