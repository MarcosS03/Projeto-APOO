package br.com.ifpe.apoo.estacionamento.apresentação;

import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.model.financeiro.IPagamento;
import br.com.ifpe.apoo.estacionamento.model.financeiro.Pagamento;
import br.com.ifpe.apoo.estacionamento.model.financeiro.PerNoite;
import br.com.ifpe.apoo.estacionamento.model.financeiro.ProximoPolo;
import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaCoberta;
import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaSUV;

public class ValoresAdicional {

	Scanner sc = new Scanner(System.in);

	public double valorHonra() {
		IPagamento  v = new Pagamento();
		var valor = v.taxa();
		while (true) {
			System.out.println("""
					Escolha os tipos adicionais

					1 - Per Noite
					2 - Proximo ao Polo
					3 - Vaga com Coberta
					4 - Veiculo SUV
					5 - Concluir/sem adicional
					""");
			var op = sc.nextLine();
			var escolha = Integer.parseInt(op);

			if (escolha >= 5) {
				System.out.println("Atendimento finalizado");
				break;
			}

			switch (escolha) {
			case 1: {

				v = new PerNoite(v);
				valor = v.taxa();
				System.out.println(valor +"testeS classe valoresAdicional");
				break;
			}
			case 2: {
				v = new ProximoPolo(v);
				valor = v.taxa();
				System.out.println(valor +"testeS classe valoresAdicional");
				break;
			}
			case 3: {
				v = new VagaCoberta(v);
				valor = v.taxa();
				System.out.println(valor +"testeS classe valoresAdicional");
				break;
			}
			case 4:{
				
				v = new VagaSUV(v);
				valor = v.taxa();
				System.out.println(valor +"testeS classe valoresAdicional");
				break;
			}
			
			}

		}


		return valor;
	}



}
