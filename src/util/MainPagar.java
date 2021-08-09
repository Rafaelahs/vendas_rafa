package util;
//abstração, herança, polimorfismo
public abstract class MainPagar {
    public abstract void main (String[] args);{
    	Pagamento pagamento1 = new PagamentoCartao();
		Pagamento pagamento2 = new PagamentoDinheiro();
		Pagamento pagamento3 = new PagamentoBoleto();
			pagamento2.pagar();
			pagamento1.pagar();
			pagamento3.pagar();		
}
}

