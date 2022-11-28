package antipattern;

public class Teste {

	public static void main(String[] args) {
		
		Equipamento madeira = new Madeira();
		madeira.montar();
		System.out.println("--------------------------------");
		
		Equipamento porca = new Porca();
		porca.montar();
		
		System.out.println("--------------------------------");
		
		Equipamento prego = new Prego();
		prego.montar();
		
		System.out.println("--------------------------------");
		
		
			
	}
	
}
