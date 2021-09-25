package tarefa_04;

public class Corretora implements AcaoObserver {
    private String nome;
    public Corretora(String nome){
        this.nome = nome;
    }
    @Override
    public void notificaAcao(Acao acao) {
        System.out.println("Corretora"+this.nome+"Notificada");
        System.out.println("Acao "+acao.getCodigo()+" teve seu valor alterado para "+acao.getValor());
    }
}
