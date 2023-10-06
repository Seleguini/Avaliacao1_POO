//Gabriel Seleguini Monteiro RA11320007
package questao1;

public class CartaoCredito extends Pagamento{
    private String numCartao;
    private String bandeiraCartao;
    private String titularCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao, String bandeiraCartao, String titularCartao) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.bandeiraCartao = bandeiraCartao;
        this.titularCartao = titularCartao;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
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
               "\n Bandeira Cartão= " + getBandeiraCartao() +
               "\n Titular Cartão= " + getTitularCartao();

    }
}
