package cachorroQuente;

public class CachorroQuente {
	String proteina;
	String queijo;
	boolean adicional[] = {false,false,false,false};
	String bebida;
	
	public CachorroQuente(String proteina, String queijo, String bebida) {
		this.proteina = proteina;
		this.queijo = queijo;
		this.bebida = bebida;
	}
	
	public void setAdicional(boolean maionese, boolean ketchup, boolean ovo, boolean batata) {
		this.adicional[0] = maionese;
		this.adicional[1] = ketchup;
		this.adicional[2] = ovo;
		this.adicional[3] = batata;
		
	}
	
}
