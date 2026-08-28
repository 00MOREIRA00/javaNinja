package NivelIntermediario.interfacee;

import java.util.UUID;

public interface Pagamento {
    String modelo = "Pagamento";

    String criarToken(UUID credencial);

    String criarPagamento(String documento);

    String consultarPagamento(String documento);
}
