package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("agra a segunda conta esta " + "na agencia "  + segundaConta.agencia);

		if(primeiraConta == segundaConta) {
			System.out.println("Sim, são a mesma conta!");
		} else {
			System.out.println("Contas diferentes");
			
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
	
		
		
	}

}
