package tarefa_01.emissores;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

import tarefa_01.Emissor;
import tarefa_01.EmissorDecorador;

public class EmissorDecoratorComCompressao extends EmissorDecorador{
    public EmissorDecoratorComCompressao(Emissor emissor){
        super(emissor);
    }
    @Override
    public void envia(String menssagem) {
        System.out.println("Enviado mensagem comprimida");
        String messagemComprimida;
        try {
            messagemComprimida = comprime(menssagem);
        } catch (IOException e) {
           messagemComprimida = menssagem;
        }
        this.getEmissor().envia(messagemComprimida);
    }
    private String comprime(String messagem)throws IOException{
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream dout = new DeflaterOutputStream(out, new Deflater());
        dout.write(messagem.getBytes());
        dout.close();
        return new String(out.toByteArray());
    }
}
