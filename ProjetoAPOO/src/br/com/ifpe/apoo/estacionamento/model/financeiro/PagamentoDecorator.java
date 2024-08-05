package br.com.ifpe.apoo.estacionamento.model.financeiro;

public abstract class PagamentoDecorator implements IPagamento {

	private Pagamento pagamentoDecorator;
	
	
	public PagamentoDecorator(Pagamento pagamentoDecorator) {
		this.pagamentoDecorator = pagamentoDecorator;
	}


	@Override
	public double taxa() {
		
		return pagamentoDecorator.taxa();
	}


	public Pagamento getPagamentoDecorator() {
		return pagamentoDecorator;
	}


}
