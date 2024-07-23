package br.com.ifpe.apoo.estacionamento.app;



import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.controller.CadastrarVeiculo;
import br.com.ifpe.apoo.estacionamento.controller.Controller;
import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;



public class Apresentacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Controller controle = new Controller();


/*
		System.out.println("""
				Olá, informe o numero correspondente ao que você deseja!

				1 - Estacionar e cadastrar veículo
				2 - Consultar veículo estacionado
				3 - Efetuar pagamento e desestacionar
				4 - Atualizar dados do veículo ou do proprietário

				""");
		var escolha = sc.nextInt();



		switch (escolha) {
		case 1: {

			controle.estacionar();
			break;

		}
		case 2: {
			System.out.println("Informe a placa do seu veiculo!");
			var placa = sc.nextLine();

			var consulta = controle.Consultar(placa);
			System.out.println(consulta);

		}
		case 3: {
			System.out.println("Informe a placa do seu veiculo!");
			var placa = sc.nextLine();


			System.out.println("informe os dados do seu veículo");


			controle.atualizar(placa);




		}
		case 4: {

		}

		}
		 */

		Moto moto = new Moto.MotoBuilder()
				.marca("Honda")
				.anoFabricacao(2020)
				.placa("qyc")
				.build();






		GenericDAO.singleton()
		.add(moto);


		Carro carro = new Carro.CarroBuilder()
				.marca("Toyota")
				.modelo("corolla")
				.anoFabricacao(2020)
				.placa("ttt")
				.build();

		GenericDAO.singleton()
		.add(carro);


		
		



		var moto1 = GenericDAO.singleton()
				.consult("qyc");
		
		var carro1 = GenericDAO.singleton()
				.consult("ttt");

		System.out.println(moto1);

		System.out.println(carro1);
	}
}
