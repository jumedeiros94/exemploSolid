package OpenClosed;

public enum TipoImpressao {
    PDF("PDF") {
        @Override
        public void imprimir() {
            System.out.println("Imprimir PDF");
        }
    },
    CSV("CSV") {
        @Override
        public void imprimir() {
            System.out.println("Imprimir CSV");
        }
    },
    MATRICIAL("MATRICIAL") {
        @Override
        public void imprimir() {
            System.out.println("Imprimir MATRICIAL");
        }
    };

    private String value;

    private TipoImpressao(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    public abstract void imprimir();
}

