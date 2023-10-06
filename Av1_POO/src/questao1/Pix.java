//Gabriel Seleguini Monteiro RA11320007
package questao1;

public class Pix extends Pagamento{
    private boolean comprovanteTransacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    public boolean isComprovanteTransacaoPix() {
        return comprovanteTransacaoPix;
    }

    public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
        this.comprovanteTransacaoPix = comprovanteTransacaoPix;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "\n Data e Hora= " + getDataHoraPagamento() +
               "\n Nº Pagamento= " + getNumeroPagamento() +
               "\n Valor Pago= " + getValorPago() +
               "\n Comprovante Pix= " + isComprovanteTransacaoPix();
    }
}
