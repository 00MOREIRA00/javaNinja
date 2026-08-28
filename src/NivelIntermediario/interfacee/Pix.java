package NivelIntermediario.interfacee;

import java.util.UUID;

public class Pix implements Pagamento{

    @Override
    public String criarToken(UUID token){
        System.out.println(token);
        return token.toString();
    }

    @Override
    public String criarPagamento(String documento){
        System.out.println(documento);
        return documento;
    }

    @Override
    public String consultarPagamento(String documento){
        System.out.println(documento);
        return documento;
    }
}
