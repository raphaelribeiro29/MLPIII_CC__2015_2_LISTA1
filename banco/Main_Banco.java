package banco;

public class Main_Banco {

	public static void main(String[] args) {
		
		Conta cc1 = new Conta("123456-7", 100.00);
		
		cc1.extrato();
		cc1.creditar(200.50);
		cc1.extrato();
		cc1.debitar(50.50);
		cc1.extrato();
		
		Conta cc2 = new Conta("135790-1", 500.00);
		
		cc2.extrato();
		cc2.creditar(300.00);
		cc2.extrato();
		cc2.debitar(2000.00);
		cc2.extrato();
		cc2.debitar(200.00);
		cc2.extrato();
		
		cc2.transferir(cc1, 300);
	}
}
