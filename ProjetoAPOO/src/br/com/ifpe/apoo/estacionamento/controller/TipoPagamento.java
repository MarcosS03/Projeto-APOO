package br.com.ifpe.apoo.estacionamento.controller;

import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaCoberta;
import br.com.ifpe.apoo.estacionamento.model.financeiro.Pagamento;
import br.com.ifpe.apoo.estacionamento.model.financeiro.PerNoite;

public class TipoPagamento {
	
	private Pagamento pagamento;
	private PerNoite pagamentoPernoite;
	private VagaCoberta pagamentoFuncionario;
	
	public void tipotempo() {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("""
				Escolha um tipo de pagamento abaixo:
				1 - Tempo Normal
				2 - Per-noite
				3 - Estacionamento Funcionario
				""");
		var opcao = sc.nextInt();
		
		
		switch (opcao) {
		case 1: {
			
			this.pagamento.taxa();
			break;
				
		}
		case 2: {
			
			this.pagamentoPernoite.taxa();
			break;
		}
		case 3: {
			
			this.pagamentoFuncionario.taxa();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcao);
		}
		
		
	}

}
