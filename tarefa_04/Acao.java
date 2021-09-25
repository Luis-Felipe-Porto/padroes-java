package tarefa_04;

import java.util.HashSet;
import java.util.Set;

public class Acao {
    private final String codigo;
    private double valor;
    private Set<AcaoObserver> interessados = new HashSet<>();

    public Acao(String codigo,double valor){
        this.codigo =codigo;
        this.valor = valor;
    }
    public void registraInteressados(AcaoObserver acaoObserver){
        this.interessados.add(acaoObserver);
    }
    public void cancelarInterresse(AcaoObserver o){
        this.interessados.remove(o);

    }
    public String getCodigo() {
        return codigo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
        for (AcaoObserver acaoObserver : this.interessados) {
            acaoObserver.notificaAcao(this);
        }
    }
}
