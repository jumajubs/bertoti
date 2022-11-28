package antipattern;

public class Teste {
	public static void main(String[] args) {
		Caneta lapis = new Lapis();
		Caderno livro = new Livro();
		
		Carrinho carrinho = new Carrinho();
		carrinho.addCaneta(lapis);
		carrinho.addCaderno(livro);
		
		carrinho.buy();
		
		carrinho.addCaneta(lapis);
		carrinho.addCaderno(livro);
		
		carrinho.buy();
	}
}
