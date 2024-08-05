package br.com.ifpe.apoo.estacionamento.model.financeiro;

public class PerNoite extends PagamentoDecorator{

	
	
	
	public PerNoite(Pagamento pagamentoDecorator) {
		super(pagamentoDecorator);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double taxa() {
		
		return super.taxa() * 0.75;
	}

}
