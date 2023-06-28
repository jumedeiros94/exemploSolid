package OpenClosed;

public class GeradorImpressao {
    public void imprimir(String tipoImpressao) {
        TipoImpressao.valueOf(tipoImpressao).imprimir();
    }
}