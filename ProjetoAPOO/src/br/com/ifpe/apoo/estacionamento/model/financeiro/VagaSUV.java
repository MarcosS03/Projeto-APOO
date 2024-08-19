package br.com.ifpe.apoo.estacionamento.model.financeiro;

public class VagaSUV extends PagamentoDecorator {

	public VagaSUV(IPagamento pagamentoDecorator) {
		super(pagamentoDecorator);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public double taxa() {
		
		return super.taxa() + 1.00;
	}

}
