package tarefa_01.emissores;

import tarefa_01.Emissor;
import tarefa_01.EmissorDecorador;

public class EmissorDecoratorComCiptografia extends EmissorDecorador{
    public EmissorDecoratorComCiptografia(Emissor emissor){
        super(emissor);
    }
    @Override
    public void envia(String menssagem) {
        System.out.println("Envia messagen ciptografada");
        this.getEmissor().envia(ciptografa(menssagem));
    }
    private String ciptografa(String menssagem){
        String menssagemCiptografada = new StringBuilder(menssagem).reverse().toString();
        return menssagemCiptografada;
    }
}
