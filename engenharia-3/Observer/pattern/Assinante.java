import java.util.Observable;
import java.util.Observer;

class Assinante implements Observer {

	Observable revista;

	int edicaoNovaRevista;

	public Assinante(Observable revista) {
		this.revista = revista;
		revista.addObserver(this);
	}

	@Override
	public void update(Observable revistaSubject, Object arg1) {
		if (revistaSubject instanceof Revista) {
			Revista revista = (Revista) revistaSubject;
			edicaoNovaRevista = revista.getEdicao();
			System.out.println("Chegou uma nova edição da Revista. " + "Edição número: " + edicaoNovaRevista);
		}
	}
}