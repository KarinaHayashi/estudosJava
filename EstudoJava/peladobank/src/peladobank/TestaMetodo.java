package peladobank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaKarina = new Conta();
		contaDaKarina.saldo = 500;
		contaDaKarina.deposita(800);
		System.out.println(contaDaKarina.saldo);
		boolean conseguiuRetirar = (contaDaKarina.saca(200));
		System.out.println(contaDaKarina.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaAmora = new Conta();
		contaDaAmora.deposita(6000);
		
		contaDaAmora.transfere(800, contaDaKarina);
		
	}
}
