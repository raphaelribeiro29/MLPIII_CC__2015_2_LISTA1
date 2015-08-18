package banco;

public class ContaCorrente extends Conta{

	public ContaCorrente (String numero, double saldo)
	{
		super(numero, saldo);
	}
	
	public void atualizar (double taxa)
	{
		super.atualizar(taxa * 3);
	}
	
	public void creditar (double valor)
	{
		super.creditar(valor - 0.1);
	}
}
