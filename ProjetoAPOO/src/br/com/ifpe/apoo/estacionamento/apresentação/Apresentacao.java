package br.com.ifpe.apoo.estacionamento.apresentação;



import java.util.Scanner;
import br.com.ifpe.apoo.estacionamento.model.Carro;
import br.com.ifpe.apoo.estacionamento.model.Moto;




public class Apresentacao {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		Facade facade = new Facade();



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
			Integer escolha= null;

			try {
				escolha = Integer.parseInt(valor);

				if (escolha == 5) {

					System.out.println("Atendimento finalizado");

					break;
				}

				switch (escolha) {
				case 1: {

					facade.cadastrarVeiculo();

					int opcaoVeiculo =  facade.dadosVeiculo().tipoVeiculo;

					if (facade.consultar(facade.dadosVeiculo().placa) != null) {
						System.out.println("veiculo ja possue cadastro \n");
						break;
					}

					if (opcaoVeiculo == 1) {

						

						Moto moto = new Moto.MotoBuilder()
								.marca(facade.dadosVeiculo().marca)
								.modelo(facade.dadosVeiculo().modelo)
								.anoFabricacao(facade.dadosVeiculo().anoFabricacao)
								.proprietario(facade.dadosVeiculo().proprietario)
								.cpf(facade.dadosVeiculo().cpf)
								.placa(facade.dadosVeiculo().placa)
								.build();

						facade.estacionar(moto);

						if (facade.consultar(moto.getPlaca()) == null) {
							System.out.println("Veiculo não cadastrado, verificar os campos e tente novamente \n");
						}

						break;
					}else if (opcaoVeiculo == 2) {
						
						Carro  carro = new Carro.CarroBuilder()
								.marca(facade.dadosVeiculo().marca)
								.modelo(facade.dadosVeiculo().modelo)
								.anoFabricacao(facade.dadosVeiculo().anoFabricacao)
								.proprietario(facade.dadosVeiculo().proprietario)
								.cpf(facade.dadosVeiculo().cpf)
								.placa(facade.dadosVeiculo().placa)
								.build();

						facade.estacionar(carro);
						if (facade.consultar(carro.getPlaca()) == null) {
							System.out.println("Veiculo não cadastrado, verificar os campos e tente novamente \n");
						}
						break;
					
					}
					break;

				}
				case 2: {

					System.out.println("Informe a placa do seu veiculo!");
					var placa = sc.nextLine();

					var consulta = facade.consultar(placa);
					if (consulta == null) {
						System.out.println("Veiculo não encontrado!");
						break;
					}
					System.out.println(consulta);
					break;


				}
				case 3: {

					System.out.println("Informe a placa do seu veiculo!");
					var placa = sc.nextLine();
					var valorHora = new ValoresAdicional().valorHonra();

					var s = String.valueOf(valorHora);
					var v = Double.parseDouble(s);

					var pagamento = facade.ValorAPagar(placa, v);

					System.out.println("Valor total R$: "+pagamento);
					break;

				}
				case 4: {
					System.out.println("Informe a placa do seu veiculo!");
					var placa = sc.nextLine();

					DadosVeiculo dadosVeiculoAtualizado = new DadosVeiculo();
					dadosVeiculoAtualizado.cadastrarVeiculo();




					System.out.println("informe os dados do seu veículo");

					facade.Atualizar(placa, dadosVeiculoAtualizado);
					break;
				}
				default:
					System.out.println("opção invalida\n\n");



				}
			} catch (Exception e) {
				System.out.println(e.getMessage().valueOf("Caracter inválido!"));;

			}
		}

	}
}
