package bytebank;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDoBruno = new Conta();
		System.out.println(contaDoBruno.getSaldo());
		
		contaDoBruno.titular = new Cliente();
		System.out.println(contaDoBruno.titular);
		
		contaDoBruno.titular.nome = "Bruno";
		System.out.println(contaDoBruno.titular.nome);
		
	}

}
