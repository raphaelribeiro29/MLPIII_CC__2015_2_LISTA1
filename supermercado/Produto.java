package supermercado;

public class Produto {

	private String descricao;
	private double valor;
	private int quantidade;
	
	public Produto (String descricao, double valor, int quantidade){
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public String getDescricao () {
		return descricao;
	}
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	public double getValor () {
		return valor;
	}
	public void setValor (double valor) {
		this.valor = valor;
	}
	public int getQuantidade () {
		return quantidade;
	}
	public void setQuantidade (int qtdEstoque) {
		this.quantidade = qtdEstoque;
	}
	
	public void imprimir (){
		System.out.println("IMPRIMINDO...");
		System.out.println("Descrição: " + descricao);
		System.out.printf("Valor %.2f%n", valor);
		System.out.printf("Quantidade: %d%n", quantidade);
	}
}
