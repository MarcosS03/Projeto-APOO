package br.com.ifpe.apoo.estacionamento.apresentação;

import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.model.financeiro.IPagamento;
import br.com.ifpe.apoo.estacionamento.model.financeiro.Pagamento;
import br.com.ifpe.apoo.estacionamento.model.financeiro.ProximoPolo;
import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaCoberta;
import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaPremium;
import br.com.ifpe.apoo.estacionamento.model.financeiro.VagaSUV;

public class ValoresAdicional {

	Scanner sc = new Scanner(System.in);

	public double valorHonra() {
		IPagamento  v = new Pagamento();
		var valor = v.taxa();


		while (true) {
			try {
			System.out.println("""
					\nEscolha os tipos adicionais

					1 - Vaga Premium
					2 - Proximo ao Polo
					3 - Vaga com Coberta
					4 - Veiculo SUV
					5 - Concluir/sem adicional\n
					""");
			var op = sc.nextLine();
			Integer escolha = Integer.parseInt(op);

			


				if (escolha == 5) {
					System.out.println("\nAtendimento finalizado");
					break;
				}

				switch (escolha) {
				case 1: {

					v = new VagaPremium(v);
					valor = v.taxa();
					break;
				}
				case 2: {
					v = new ProximoPolo(v);
					valor = v.taxa();
					break;
				}
				case 3: {
					v = new VagaCoberta(v);
					valor = v.taxa();
					break;
				}
				case 4:{

					v = new VagaSUV(v);
					valor = v.taxa();
					break;
				}
				default:
					System.out.println("\nopção "+escolha+" invalida\n\n");

				}
			} catch (Exception e) {
				System.out.println(e.getMessage().valueOf("\nCaracter valores adicionais inválido!"));;
			}
		}


		return valor;
	}



}
