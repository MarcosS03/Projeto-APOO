package br.com.ifpe.apoo.estacionamento.model.financeiro;

public abstract class PagamentoDecorator implements IPagamento {

	protected IPagamento pagamentoDecorator;
	
	
	public PagamentoDecorator(IPagamento pagamentoDecorator) {
		this.pagamentoDecorator = pagamentoDecorator;
	}



	@Override
	public double taxa() {
		
		return pagamentoDecorator.taxa();
	}


}
