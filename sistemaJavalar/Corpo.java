package sistemaJavalar;

public class Corpo {
	//posicao
	protected int x = 10;
	protected int y =  10;
	protected String nome; 
	
	public int dist;
	public int sobra;
	private int vel;
	protected int ano;
	protected int qtdDias;
	protected float dia;
	
	private boolean cima = false;
	public boolean esquerda = true;
	private boolean baixo = false;
	private boolean direita = false;
	
	
	public Corpo(int v, int distancia, float dia, String nome) {
		this.vel = v;
		this.dist = distancia;
		this.y+= distancia ;
		this.nome = nome;
		this.dia = dia;
	}
	
	public int getVel() {
		return this.vel;
	}
	
	public void cima() {
		this.cima = true;
		this.direita = false;
	}
	
	public void esquerda() {	
		this.esquerda = true;
		this.cima = false;
		this.ano++;
	}

	public void baixo() {
		this.baixo = true;
		this.esquerda = false;
	}
	
	public void direita() {
		this.direita = true;
		this.baixo = false;
	}
	
	
	
	public void alteraVel(int v) {
		this.vel += v;
	}
	
	public void move(EstrelaJava estrela, int deslocamento) {
		
		if(this.esquerda) {
			this.x-= deslocamento ;
		}else if(this.baixo) {
			this.y-= deslocamento ; 
		}else if(this.direita) {
			this.x+= deslocamento ;
		}else if(this.cima) {
			this.y+= deslocamento ;
		}
		
		this.verificaDeslocamento(estrela);
	}
	
	//Trajetoria
	public void verificaDeslocamento(EstrelaJava estrela) {
		//corrige posição para caso saia da orbita pela esquerda
		if(this.x < estrela.x - this.dist && this.esquerda ) {
			this.sobra = (estrela.x - this.dist) - this.x;
			this.x = estrela.x - this.dist;
			this.baixo();
			
			
		}//corrige posição para caso saia da orbita pela esquerda
		else if(this.y < estrela.y - this.dist && this.baixo ) {
			this.sobra = (estrela.y - this.dist) - this.y;
			this.y = estrela.y - this.dist;
			this.direita();
			
			
		}//corrige posição para caso saia da orbita por baixo
		else if(this.x > estrela.x + this.dist && this.direita) {
			this.sobra = this.x - (estrela.x + this.dist) ;
			this.x = estrela.x + this.dist;
			this.cima();
			
			
		}//corrige posição para caso saia da orbita por cima
		else if(this.y > estrela.y + this.dist && this.cima) {
			this.sobra = this.y - (estrela.y + this.dist);
			this.y = estrela.y + this.dist;
			this.esquerda();
		}//caso o planeta se encontre corretamente em órbita
		else
			this.sobra = 0;
		if(this.sobra>0)
			this.move(estrela, this.sobra);
	}
	
	
	//descrição das posições dos planetas
	public void desc() {
		System.out.println(
				this.nome+
				"\nx = "+this.x+
				"\ny = "+this.y+
				"\npassaram "+this.ano+" anos\n==================\n"+
				"dias: ");
	}
}
