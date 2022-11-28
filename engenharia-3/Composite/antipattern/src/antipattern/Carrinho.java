package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Lapis> lapis = new ArrayList<Lapis>();
	private List<Livro> livro = new ArrayList<Livro>();
	
	public void buy() {
		for(Lapis la: lapis)
		{
			la.buy();
		}
		for(Livro liv: livros)
		{
			liv.buy();
		}
		System.out.println("Compra realizada com sucesso!");
		lapis.clear();
		livros.clear();
	}

	public void addLapis(Lapis c){
		this.lapis.add(c);
	}
	
	public void addLivro(Livro c){
		this.livro.add(c);
	}
	
	public void removeLapis(Lapis c){
		lapis.remove(c);
	}
	
	public void removeLivro(Livro c){
		livro.remove(c);
	}
	
}
