package sistemaJavalar;
import java.util.ArrayList;
public class Corpo {
	//posicao
	protected int x = 10;
	protected int y =  10;
	protected String nome; 
	
	public int dist;
	public int sobra;
	private int vel;
	protected int ano;
	protected float qtdDias;
	protected float duraDia;
	
	private boolean cima = false;
	public boolean esquerda = true;
	private boolean baixo = false;
	private boolean direita = false;
	
	
	public Corpo(int v, int distancia, float dia, String nome) {
		this.vel = v;
		this.dist = distancia;
		this.y+= distancia ;
		this.nome = nome;
		this.duraDia = dia;
	}
	
	public int getVel() {
		return this.vel;
	}
	
	// Muda a velocidade do planeta
	public void colisao(ArrayList<UFO> ufo){
		if(this.vel != 0) {
			for (int i = 0; i < ufo.size(); i++) {
				if(this.x == ufo.get(i).getX() && this.y == ufo.get(i).getY()) {
					this.vel+= ufo.get(i).getIncremento();
					
				}
			}
		}	
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
				"Planeta "+
				this.nome+
				"\n   posição x = "+this.x+
				"\n   posição y = "+this.y+
				"\n   velocidade= "+this.vel+
				"\n   Translação = "+this.ano+ " anos"+
				"\n   Rotação = " +this.qtdDias+" dias"+
				
				" \n==================\n");
	}
}
