package br.com.ifpe.apoo.estacionamento.model.financeiro;

public class VagaCoberta extends PagamentoDecorator {

	public VagaCoberta(IPagamento pagamentoDecorator) {
		super(pagamentoDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double taxa() {
		
		return super.taxa() + 2.00;
	}

}
