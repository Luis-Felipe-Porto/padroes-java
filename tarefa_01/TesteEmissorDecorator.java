package tarefa_01;

import tarefa_01.emissores.EmissorDecoratorComCiptografia;
import tarefa_01.emissores.EmissorDecoratorComCompressao;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        String mensagem = "";

        Emissor emissorCript = new EmissorDecoratorComCiptografia(new EmissorBasico());
        emissorCript.envia(mensagem);
        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);
        Emissor emissorCompCrip = new EmissorDecoratorComCiptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissorCompCrip.envia(mensagem);
    }
}
