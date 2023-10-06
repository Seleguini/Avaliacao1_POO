//Gabriel Seleguini Monteiro RA11320007
package questao1;

public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal() {
        return "\n Data e Hora= " + getDataHoraPagamento() +
               "\n Nº Pagamento= " + getNumeroPagamento() +
               "\n Valor Pago= " + getValorPago() +
               "\n Nº Cartão= " + getNumCartao() +
               "\n Titular Cartão= " + getTitularCartao();
    }
}
