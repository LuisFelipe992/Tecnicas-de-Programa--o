package controller;
import java.util.ArrayList;
public class Corpo {
	//posicao
	public int x = 7;
	public int y =  7;
	protected String nome; 
	
	public int dist;// disatancia até a estrela
	public int nColisoesDev;
	public int nColisoesBug;
	public int sobra;//variavel auxiliar no posicionamento do objeto
	private int vel;
	protected int ano;
	protected float qtdDias;
	protected float duraDia;
	
	//controle de direção e sentido
	private boolean cima = false;
	public boolean esquerda = true;
	private boolean baixo = false;
	private boolean direita = false;
	
	// construtor
	public Corpo(int v, int distancia, float dia, String nome) {
		this.vel = v;
		this.dist = distancia;
		this.y-= distancia ;
		this.nome = nome;
		this.duraDia = dia;
	}
	
	public int getVel() {
		return this.vel;
	}
	public void setVel(int vel) {
		this.vel += vel;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public float getQtdDias() {
		return qtdDias;
	}
	public float getAno() {
		return this.ano;
	}

	// Muda a velocidade do planeta
	public void colisao(ArrayList<UFO> ufo){
		if(this.vel >= 0) {
			for (int i = 0; i < ufo.size(); i++) {
				if(this.x == ufo.get(i).getX() && this.y == ufo.get(i).getY()) {
					this.vel+= ufo.get(i).getIncremento();
					
				}
			}
		}	
	}
	/*********************************************
	 		metodos para mudar a posição
	*********************************************/
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
	/********************************************/
	
	// Mudar a velocidade do objeto
	public void alteraVel(int v) {
		this.vel += v;
	}
	
	//fazer o deslocamento do corpo
	
	public void move( int deslocamento) {
		
		if(this.esquerda) {
			this.x-= deslocamento ;
		}else if(this.baixo) {
			this.y+= deslocamento ; 
		}else if(this.direita) {
			this.x+= deslocamento ;
		}else if(this.cima) {
			this.y-= deslocamento ;
		}
		
		this.verificaDeslocamento();
		
	}
	
	/*******************
	 * metodo corretor da posição de objetos em órbita 
	 *
	 *******************/
	public void verificaDeslocamento() {
		//corrige posição para caso saia da orbita pela esquerda
		int estrelaX = 7;
		if(this.x < estrelaX - this.dist && this.esquerda ) {
			this.sobra = (estrelaX - this.dist) - this.x;
			this.x = estrelaX - this.dist;
			this.baixo();
			
			
		}//corrige posição para caso saia da orbita pela esquerda
		else if(this.y < estrelaX - this.dist && this.cima ) {
			this.sobra = (estrelaX - this.dist) - this.y;
			this.y = estrelaX - this.dist;
			this.esquerda();
			
			
		}//corrige posição para caso saia da orbita por baixo
		else if(this.x > estrelaX + this.dist && this.direita) {
			this.sobra = this.x - (estrelaX + this.dist) ;
			this.x = estrelaX + this.dist;
			this.cima();
			
			
		}//corrige posição para caso saia da orbita por cima
		else if(this.y > estrelaX + this.dist && this.baixo) {
			this.sobra = this.y - (estrelaX + this.dist);
			this.y = estrelaX + this.dist;
			this.direita();
		}//caso o planeta se encontre corretamente em órbita
		else
			this.sobra = 0;
		if(this.sobra>0)
			this.move(this.sobra);
	}
	
	
	//descrição das posições dos planetas
	public void desc() {
		System.out.println(
				" \n_____________________________________________________________\n"+
				"Planeta "+
				this.nome+
				"\n   posição = ["+this.x+
				" : "+this.y+"]"+
				"\n   velocidade= "+this.vel+" p/ut"+
				"\n   Anos = "+this.ano+ " anos"+
				"\n   Dias = " +this.qtdDias+" dias"
				
				);
	}

	public void resetaPosi() {
			this.y = 7-this.dist;
			this.x = 7;
	}
}
