package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.Corpo;
import controller.UFO;
import view.ViewPlaneta;


// Tela de visualizacao dos planetas
public class Painel extends JPanel{
	
	int [][] posicao = new int[15][15];
	int largura;
	int altura;
	ArrayList<Corpo> planetas;
	ArrayList<UFO> bug;
	ArrayList<UFO> dev;
	
	//estava eu tentando trazer os devs e os bugs para cá!...
	
	public Painel( ArrayList<Corpo> planetas,ArrayList<UFO> dev, ArrayList<UFO> bug) {
		this.largura = 15;
		this.altura = 15;
		this.planetas = planetas;
		this.bug = bug;
		this.dev = dev;
		
		this.setBackground(Color.black);
		this.setSize(600,600);
		this.setLayout(new GridLayout(15,15));
		this.posiciona(planetas);
		
	}
	
	public void posiciona(ArrayList<Corpo> planetas) {
		//testando a matriz
		this.removeAll();
		this.revalidate();
		this.repaint();
		
		
		String texto = "";
		//posiciona bugs
		
		
		for(int j = 0; j<largura; j++) {
			for(int i = 0; i<altura; i++) {
				
				
				
				if(i==(altura-1)/2 && j==(largura-1)/2) {
					texto = "Java";
				}
				else if(j==planetas.get(0).getY() && i==planetas.get(0).getX()) {
					texto = "Py";
				}else if(j==planetas.get(1).getY() && i==planetas.get(1).getX()) {
					texto = "JS";
				}else if(j==planetas.get(2).getY() && i==planetas.get(2).getX()) {
					texto = "Ruby";
				}else if(j==planetas.get(3).getY() && i==planetas.get(3).getX()) {
					texto = "PHP";
				}else if(j==planetas.get(4).getY() && i==planetas.get(4).getX()) {
					texto = "C#";
				}else if(j==planetas.get(5).getY() && i==planetas.get(5).getX()) {
					texto = "C++";
				}else if(j==planetas.get(6).getY() && i==planetas.get(6).getX()) {
					texto = "C";
				}else {
					texto = "";
					for(int k = 0; k<this.bug.size(); k++) {
						if(bug.get(k).getY()==j && bug.get(k).getX()==i) {
							texto = "-";
						}
						
					}
					for(int k = 0; k<this.dev.size(); k++) {
						if(dev.get(k).getY()==j && dev.get(k).getX()==i) {
							texto = "+";
						}
						
					}
				}
					
					
					//texto = "["+i+","+j+"]";
					
				this.add(new ViewPlaneta(texto));

			}
		}
		
	}
	
	public void posicionaEspecial(ArrayList<UFO> bug, ArrayList<UFO> dev) {
		//colunas 
		for(int j = 0; j<bug.size(); j++) {
			//linhas
			for(int i = 0; i<bug.size(); i++) {
				
			}
		}
	}

}
