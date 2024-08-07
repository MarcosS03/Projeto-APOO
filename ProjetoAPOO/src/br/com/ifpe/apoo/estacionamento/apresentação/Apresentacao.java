package br.com.ifpe.apoo.estacionamento.apresentação;



import java.util.Scanner;

import br.com.ifpe.apoo.estacionamento.controller.Controller;
import br.com.ifpe.apoo.estacionamento.controller.ControllerMoto;
import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Moto;
import br.com.ifpe.apoo.estacionamento.model.Veiculo;
import br.com.ifpe.apoo.estacionamento.repository.GenericDAO;



public class Apresentacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ControllerMoto controle = new ControllerMoto(); //aqui aplicar o padrão AbstractFactoey para acessar o controller



		while (true) {


			System.out.println("""
					Olá, informe o numero correspondente ao que você deseja!

					1 - Estacionar e cadastrar veículo
					2 - Consultar veículo estacionado
					3 - Efetuar pagamento e desestacionar
					4 - Atualizar dados do veículo ou do proprietário
					5 - Finalizar atendimento

					""");
			var valor = sc.nextLine();
			var escolha = Integer.parseInt(valor);


			if (escolha >= 5) {
				System.out.println("Atendimento finalizado");
				break;
			}

			switch (escolha) {
			case 1: {

				DadosVeiculo dadosV = new DadosVeiculo();
				dadosV.cadastrarVeiculo();

				int opcaoVeiculo =  dadosV.getTipoVeiculo();


				if (opcaoVeiculo == 1) {

					Moto moto = new Moto.MotoBuilder()
							.marca(dadosV.getMarca())
							.modelo(dadosV.getModelo())
							.anoFabricacao(dadosV.getAnoFabricacao())
							.proprietario(dadosV.getProprietario())
							.placa(dadosV.getPlaca())
							.build();

					controle.estacionar(moto);
					break;
				}else if (opcaoVeiculo == 2) {
					Carro  carro = new Carro.CarroBuilder()
							.marca(dadosV.getMarca())
							.modelo(dadosV.getModelo())
							.anoFabricacao(dadosV.getAnoFabricacao())
							.proprietario(dadosV.getProprietario())
							.placa(dadosV.getPlaca())
							.build();

					controle.estacionar(carro);
					break;
				}

			}
			case 2: {

				System.out.println("Informe a placa do seu veiculo!");
				var placa = sc.nextLine();

				var consulta = controle.Consultar(placa);
				System.out.println(consulta);
				break;


			}
			case 3: {
				System.out.println("Informe a placa do seu veiculo!");
				var placa = sc.nextLine();
				var valorHora = new ValoresAdicional().valorHonra();

				var s = String.valueOf(valorHora);
				var v = Double.parseDouble(s);

				var pagamento = controle.ValorAPagar(placa, v);

				System.out.println(pagamento);


			}
			case 4: {
				System.out.println("Informe a placa do seu veiculo!");
				var placa = sc.nextLine();

				System.out.println("informe os dados do seu veículo");

				controle.Atualizar(placa);

			}


			}
		}

	}
}
