package banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca (String numero, double saldo)
	{
		super(numero, saldo);
	}
	
	public void atualizar (double taxa)
	{
		super.atualizar(taxa * 2);
	}
}
