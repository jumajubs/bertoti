import java.util.Observable;

public class Revista extends Observable {

	private int numEdicao;

	public void setNovaEdicao(int novaEdicao) {
		this.numEdicao = novaEdicao;
		setChanged();
		notifyObservers();
	}

	public int getEdicao() {
		return this.numEdicao;
	}

	public static void main(String[] args) {
		int novaEdicao = 2;
		Revista revista = new Revista();
		new Assinante(revista);

		revista.setNovaEdicao(novaEdicao);
	}

}

