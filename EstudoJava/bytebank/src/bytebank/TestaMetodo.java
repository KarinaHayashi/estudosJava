package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaKarina = new Conta();
		contaDaKarina.saldo = 100;
		contaDaKarina.deposita(50);
		System.out.println(contaDaKarina.saldo);
	    boolean conseguiuRetirar = (contaDaKarina.saca(20));
		System.out.println(contaDaKarina.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contaDaKarina ); 
		System.out.println(contaDaMarcela.saldo);
		
		contaDaKarina.titular = "karina hayashi";
		System.out.println(contaDaKarina.titular);
	}
	
	
}
