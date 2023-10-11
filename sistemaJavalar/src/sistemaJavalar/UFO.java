package sistemaJavalar;
import java.util.ArrayList;
import java.util.Random;
public class UFO {
	private int x ;
	private int y ;
	private int range;
	public boolean colidiu = false;
	private int incremento;// velocidade a ser incrementada no planeta (+/-)
	private Random gerador = new Random();
	//construtor
	public UFO(int range, int incremento) {
		this.x = gerador.nextInt(range);
		this.y = gerador.nextInt(range);
		this.incremento = incremento;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getIncremento() {
		return this.incremento;
	}
	
	public void verificaPosicao(ArrayList<Corpo> planetas) {
		for(int i = 0; i< planetas.size(); i++) {
			if(this.x == planetas.get(i).x && this.y == planetas.get(i).y) {
				this.colidiu = true;
				if (this.incremento>0)
					planetas.get(i).nColisoesDev++;
				else if(this.incremento<0)
					planetas.get(i).nColisoesBug++;
			}
		}
	}
	
	public void desc() {
		if(this.incremento>0)
			System.out.println("existe desenvolvedor na posição: {"+this.x+","+this.y+"}");
		else
			System.out.println("existe bug na posição          : {"+this.x+","+this.y+"}");
	}
}
