package bytebank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente estrela = new Cliente();
		//conta.titular = estrela;
		estrela.setNome("estrela marques");
		
		conta.setTitular(estrela);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		
		System.out.println(titularDaConta);
		System.out.println(estrela);
		System.out.println(conta.getTitular());
	}

}
