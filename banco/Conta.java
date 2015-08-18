package banco;

public abstract class Conta {

	private String numero;
	private double saldo;
	
	public Conta (String numero, double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta ()
	{
		this("", 0.00);
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
		return this.saldo;
	}
	
	public String getNumero (){
		return this.numero;
	}
	
	public void setNumero (String numero)
	{
		this.numero = numero;
	}
	
	public void extrato (){
		System.out.println();
		System.out.println("   ==>   EXTRATO   <==   ");
		System.out.println("Conta: " + this.numero);
		System.out.printf("Saldo: %.2f%n%n", this.saldo);
	}
	
	public void transferir (Conta cc, double valor)
	{
		if(valor <= this.saldo)
		{
			this.debitar(valor);
			cc.creditar(valor);
			
			System.out.println();
			System.out.println("   ==>   TRANSFERÊNCIA   <==   ");
			System.out.printf("DEBITADO: %s | VALOR: %.2f%n", this.numero, this.saldo);
			System.out.printf("DEBITADO: %s | VALOR: %.2f%n%n", cc.getNumero(), cc.getSaldo());
		}
		else
			System.out.println("Saldo insuficiente para transferência!");
	}
	
	public void atualizar (double taxa)
	{
		this.saldo *= taxa;
	}
}
