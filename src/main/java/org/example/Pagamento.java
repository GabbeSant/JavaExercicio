package org.example;

public interface Pagamento {
    void pagar(double valor);
}

class PagamentoPix implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado via Pix: " + valor);
    }
}
class PagamentoCartao implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado via Cartão: " + valor);
    }
}
class PagamentoBoleto implements Pagamento {
    @Override
    public void pagar(double valor){
        System.out.println("Pagamento realizado via Boleto: " + valor);
    }
}