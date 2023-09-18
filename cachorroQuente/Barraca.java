package cachorroQuente;

public class Barraca {
	int quantidadeVendas = 0;
	String clientes[] = new String[5000];
	CachorroQuente cachorros[] = new CachorroQuente[10000];
	

	public void vender(String nome,CachorroQuente cachorro) {
		
		for(int i=0; i<this.clientes.length; i++) {
			
			if(this.clientes[i] == null) {
				
				this.clientes[i] = nome;
				this.cachorros[i] = cachorro; 
				i = this.clientes.length;
				this.quantidadeVendas++;
			}
		}
		
		
	}
}
