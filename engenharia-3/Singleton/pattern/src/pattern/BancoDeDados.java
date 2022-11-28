package pattern;

public class BancoDeDados {

	private static BancoDeDados instance;

	private BancoDeDados() {
	}

	public static synchronized BancoDeDados getInstance() {
		if (instance == null)
			instance = new BancoDeDados();

		return instance;
	}
	
}