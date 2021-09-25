package tarefa_02;

public abstract class DecoradorNumber implements NumeroBasico{
    private NumeroBasico numero;

    public DecoradorNumber(NumeroBasico number){
        this.numero = number;
    }
    public abstract void print(String menssagem);
    public NumeroBasico getNumber() {
        return numero;
    }
}
