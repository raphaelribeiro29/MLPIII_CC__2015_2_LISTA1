package supermercado;

public class Main_Produto {

	public static void main(String[] args) {

		Produto prod1 = new Produto("Creme Dental", 7.5, 15);

		prod1.imprimir();
		prod1.setQuantidade(20);
		prod1.imprimir();
		prod1.setValor(9.25);
		prod1.imprimir();
	}
	
}
