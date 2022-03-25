
public class TestaBanco {

	public static void main(String[] args) {
		Cliente karina = new Cliente();
		karina.nome = "Karina Hayashi";
		karina.cpf = "123.456.789-10";
		karina.profissao = "helpdesk";
		
		Conta contaDaKarina = new Conta(); 
		contaDaKarina.deposita(100);
		
		contaDaKarina.titular = karina;
		System.out.println(contaDaKarina.titular.nome);
	}
}
