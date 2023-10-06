//Gabriel Seleguini Monteiro RA11320007
package questao1;

public class Main {
    public static void main(String[] args) {

    Pix pix = new Pix("11:50",125,250.00,true);

    CartaoCredito cc = new CartaoCredito("12:30", 126, 239.90,"****4984","Visa", "Gabriel");

    CartaoDebito cd = new CartaoDebito("13:15", 127, 399.50, "****4542", "Bianca");

    System.out.println(pix.imprimirCupomFiscal());
    System.out.println(cc.imprimirCupomFiscal());
    System.out.println(cd.imprimirCupomFiscal());
    }
}