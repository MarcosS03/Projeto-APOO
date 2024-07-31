package br.com.ifpe.apoo.estacionamento.controller;

import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;

public class CadastrarVeiculo {


	public Veiculo cadastrarVeiculo() {

		Veiculo veiculo = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("""

				Por favor, escolha o numero de acordo com o tipo do seu veiculo!

				1 - Moto
				2 - Carro
				""");
		int tipoVeiculo = sc.nextInt();



		switch (tipoVeiculo) {

		case 1: {

			System.out.println("Informe o seu nome: ");
			var proprietario = sc.nextLine();				

			System.out.println("Informe a marca do veiculo: ");
			var marca = sc.nextLine();

			System.out.println("Informe o modelo do veiculo: ");
			var modelo = sc.nextLine();

			System.out.println("Informe o ano do veiculo: ");
			var ano = sc.nextInt();

			System.out.println("Informe a placa do veiculo: ");
			var placa = sc.nextLine();



			Moto moto = new Moto.MotoBuilder()
					.marca(marca)
					.modelo(modelo)
					.anoFabricacao(ano)
					.proprietario(proprietario)
					.placa(placa)
					.build();


			veiculo = moto;
			break;

		}

		case 2: {
			System.out.println("Informe o seu nome: ");
			var proprietario = sc.nextLine();				

			System.out.println("Informe a marca do veiculo: ");
			var marca = sc.nextLine();

			System.out.println("Informe o modelo do veiculo: ");
			var modelo = sc.nextLine();

			System.out.println("Informe o ano do veiculo: ");
			var ano = sc.nextInt();

			System.out.println("Informe a placa do veiculo: ");
			var placa = sc.nextLine();



			Carro carro = new Carro.CarroBuilder()
					.marca(marca)
					.modelo(modelo)
					.anoFabricacao(ano)
					.proprietario(proprietario)
					.placa(placa)
					.build();

			veiculo = carro;
			break;

		}

		}
		return veiculo;
	}

}
