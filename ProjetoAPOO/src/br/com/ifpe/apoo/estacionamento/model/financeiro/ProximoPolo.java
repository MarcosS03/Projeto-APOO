package br.com.ifpe.apoo.estacionamento.model.financeiro;

public class ProximoPolo extends PagamentoDecorator {

	
	public ProximoPolo(Pagamento pagamentoDecorator) {
		super(pagamentoDecorator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double taxa() {
		
		return super.taxa() + 0.5;
	}
	

}
