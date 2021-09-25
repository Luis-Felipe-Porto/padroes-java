package tarefa_01;

public abstract class EmissorDecorador implements Emissor{
    private Emissor emissor;

    public EmissorDecorador(Emissor emissor){
        this.emissor = emissor;
    }
    public abstract void envia(String menssagem);
    public Emissor getEmissor() {
        return emissor;
    }
}
