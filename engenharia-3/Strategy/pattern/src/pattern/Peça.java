package pattern;

public class Peça {
	
	private Montar montar;

	public void setMontar(Montar montar) {
		this.montar = montar;
	}
	
	public void montarPeça() {
		this.montar.montarPeças();
	}
	
}
