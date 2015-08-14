package banco;

public class Conta {

	private String numero;
	private double saldo;
	
	public Conta (String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void creditar (double valor){
		this.saldo += valor;
	}
	
	public void debitar (double valor){
		if(valor <= this.saldo)
			this.saldo -= valor;
		else
			System.out.println("Saldo insuficiente para efetuar o débito!");
	}
	
	public double getSaldo (){
		return saldo;
	}
	
	public String getNumero (){
		return numero;
	}
	
	public void extrato (){
		System.out.println();
		System.out.println("   ==>   EXTRATO   <==   ");
		System.out.println("Conta: " + numero);
		System.out.printf("Saldo: %.2f%n", saldo);
	}
	
	public void transferir (Conta cc, double valor)
	{
		if(valor <= this.saldo)
		{
			this.debitar(valor);
			cc.creditar(valor);
			
			System.out.println();
			System.out.println("   ==>   TRANSFERÊNCIA   <==   ");
			System.out.printf("DEBITADO: %s | VALOR: %.2f%n", numero, saldo);
			System.out.printf("DEBITADO: %s | VALOR: %.2f%n", cc.getNumero(), cc.getSaldo());
		}
		else
			System.out.println("Saldo insuficiente para transferência!");
	}
}
