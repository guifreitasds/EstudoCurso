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
			p1st = "est�";
		} else {
			p1st = "n�o est�";
		}
		
		if(p2.estocado) {
			p2st = "est�";
		} else {
			p2st = "n�o est�";
		}
		System.err.println("Lista de Produtos dispon�veis:");
		System.err.println("==============================");
		System.out.println("Produto 1 - " + p1.nome + " de Marca " + p1.marca + " com pre�o de R$" + p1.preco + " reais e " + p1st + " estocado");
		System.out.println("Produto 2 - " + p2.nome + " de Marca " + p2.marca + " com pre�o de R$" + p2.preco + " reais e " + p2st + " estocado");
		System.err.println("==============================");

	}

}
