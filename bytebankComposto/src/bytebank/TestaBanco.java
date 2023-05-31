package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente estrela = new Cliente();
		estrela.nome = "Estrela Marques";
		estrela.cpf = "123.456.789-00";
		estrela.profissao = "programadora";
		
		Conta contaDaEstrela = new Conta();
		contaDaEstrela.deposita(100);
		
		// Associa a cliente EStrela a contaDaEstrela
		contaDaEstrela.titular = estrela;
		
		System.out.println(contaDaEstrela.titular.nome);
		System.out.println(contaDaEstrela.titular);
		System.out.println(estrela);
	}

}
