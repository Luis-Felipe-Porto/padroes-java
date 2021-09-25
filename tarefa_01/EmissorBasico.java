package tarefa_01;

public class EmissorBasico implements Emissor{
    @Override
    public void envia(String menssagem) {
        System.out.println("Enviando uma mensagem");
        System.out.println(menssagem);
    }
}
