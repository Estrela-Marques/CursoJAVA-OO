package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaEstrela = new Conta();
		contaDaEstrela.saldo = 100;
		contaDaEstrela.deposita(50);
		System.out.println(contaDaEstrela.saldo);
		
		boolean conseguiuRetirar = contaDaEstrela.saca(20);
		System.out.println(contaDaEstrela.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoBruno = new Conta();
		contaDoBruno.deposita(1000);
		boolean sucessoTranferencia = contaDoBruno.transfere(3000,contaDaEstrela);
		if(sucessoTranferencia)  {
			System.out.println("Tranferência com sucesso!");
		} else {
			System.out.println("Faltou dinheiro. :(");
		}
		System.out.println(contaDoBruno.saldo);
		System.out.println(contaDaEstrela.saldo);
		
		contaDaEstrela.titular = "Estrela Marques";
		System.out.println(contaDaEstrela.titular);
		
	}
	
	

}
