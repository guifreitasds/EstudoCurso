package FirstClasses;

public class ProdutoTest {

	public static void main(String[] args) {
		String p1st;
		String p2st;
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.nome = "Leite";
		p1.marca = "Piracanjuba";
		p1.preco = 7f;
		p1.estocado = false;
		
		p2.nome = "Suco de Uva";
		p2.marca = "Tang";
		p2.preco = 5.79f;
		p2.estocado = true;
		if(p1.estocado) {
			p1st = "está";
		} else {
			p1st = "não está";
		}
		
		if(p2.estocado) {
			p2st = "está";
		} else {
			p2st = "não está";
		}
		System.err.println("Lista de Produtos disponíveis:");
		System.err.println("==============================");
		System.out.println("Produto 1 - " + p1.nome + " de Marca " + p1.marca + " com preço de R$" + p1.preco + " reais e " + p1st + " estocado");
		System.out.println("Produto 2 - " + p2.nome + " de Marca " + p2.marca + " com preço de R$" + p2.preco + " reais e " + p2st + " estocado");
		System.err.println("==============================");

	}

}
