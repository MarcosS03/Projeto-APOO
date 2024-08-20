package br.com.ifpe.apoo.estacionamento.model.financeiro;

public class VagaPremium extends PagamentoDecorator{

	
	
	
	public VagaPremium(IPagamento pagamentoDecorator) {
		super(pagamentoDecorator);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double taxa() {
		
		return super.taxa() + 3.00;
	}

}
