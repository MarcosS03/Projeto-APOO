package Projeto;

public class AppPrincipal {

	public static void main(String[] args) {
		Construtora constr = new Construtora();
		constr.setNome("IFPE CONSTRUCAO");
		constr.setCnpj("11.223.589/0001-89");
		
		Endereco ender =  new Endereco();
		ender.setRua("rua bela vista");
		ender.setNumero(10);
		ender.setCidade("Palmares");
		ender.setCep("55540-000");
		
		
		
		 constr.dadosPessoa();

	}

}
