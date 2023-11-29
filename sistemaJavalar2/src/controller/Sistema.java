package controller;

import java.util.Scanner;
import java.util.ArrayList;

// classe para gerenciar as entradas de dados pelo usuário
public class Sistema {
	public int tempo;
	public EstrelaJava estrela;
	public ArrayList<Corpo> planetas;
	public ArrayList<UFO> dev;
	public ArrayList<UFO> bug;
	public int tempoTotal;
	public int qtdeMomentos; // quantas vezes o usuario entrou com dados
	public int tempoCorpo;//quantidade de tempo passada para cada corpo no arquivo
	
	public Sistema(ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug) {
		this.planetas = planetas;
		this.bug = bug;
		this.dev = dev;
	}
	
	
	public void setTempo(int tempo) {
		if (tempo>=0) {
			this.tempo = tempo;
			this.tempoTotal+=this.tempo;
			this.qtdeMomentos++;
		}
	}
	
	
	//pega a String do arquivo e transforma em inteiros
	public void separaString(String txt) {
		
		String[] aux = txt.split(",");
		
		for(int i = 0; i<aux.length; i++) {
			this.tempo= Integer.parseInt(aux[i]);
			this.passaTempo(planetas.get(i));
		}

	}
	
	public void setPosi() {
		
	}
	
	public void verificaColisao() {
		for(int i = 0; i<bug.size(); i++) {
			bug.get(i).verificaPosicao(planetas);
		}
		for(int i = 0; i<dev.size(); i++) {
			dev.get(i).verificaPosicao(planetas);
		}
	}
	
	public void setDev(int qtdeDev, ArrayList<UFO> dev) {
		for (int i = 0; i < qtdeDev; i++) {
			dev.add(new UFO(15,1));
		}
	}
	
	
	
	public void setBug(int qtdeBug, ArrayList<UFO> bug) {
		for (int i = 0; i < qtdeBug; i++) {
			bug.add(new UFO(15,-1));
		}
	}
	
	public int getTempo() {
		return this.tempo;
	}
	
	// Passa o tempo setado pelo usuario para reorganizar os planetas
	public void passaTempo(Corpo planeta) {
		planeta.move(this.tempo*planeta.getVel());
		passaDia(planeta);
	}
	public void passaDia(Corpo planeta) {
		planeta.qtdDias += (this.tempo*planeta.duraDia)/24;
	}
	
	//remoção de planetas
	public void removePlaneta(ArrayList<Corpo> p) {
		for(int i = 0; i<p.size(); i++) {
			if(p.get(i).getVel()<=0) {
				System.out.println("planeta "+p.get(i).nome+" explodiu!");
				p.remove(i);
			}
		}
	}
	
	//Verifica colisões
	public void colisoes() {
		// chamada de colisao com planetas
				for(int i = 0; i<bug.size(); i++) {
					bug.get(i).verificaPosicao(planetas);
				}
				for(int i = 0; i<dev.size(); i++) {
					dev.get(i).verificaPosicao(planetas);
				}
				
				//remoção de desenvolvedores depois de colidir
				for(int i = 0; i<dev.size(); i++) {
					if(dev.get(i).colidiu)
						dev.remove(i);
					else
						dev.get(i).desc();
				}
				// remoção de bugs depois de colidir
				for(int i = 0; i<bug.size(); i++) {
					if(bug.get(i).colidiu)
						bug.remove(i);
					else
						bug.get(i).desc();
				}
				
	}
	
	
	
	
	//relatorio a cada rodada
	public void relatorioParsial(ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug, int qtdePlanetas) {
		for(int i = 0; i < planetas.size(); i++ ) {
			planetas.get(i).colisao(bug);
			planetas.get(i).colisao(dev);
			this.removePlaneta(planetas);
			this.passaTempo(planetas.get(i));
			planetas.get(i).desc();
			System.out.println("\n_______________________________________________\n");
						
		}
		if(planetas.size()<qtdePlanetas) {
			System.out.println(qtdePlanetas-planetas.size()+" planeta(s) explodiu!!");
			qtdePlanetas = planetas.size();
		}
	}
	// relatório completo
	public void relatorio(ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug, int qtdePlanetas) {
		for (int i = 0; i < planetas.size(); i++) {
			planetas.get(i).desc();
			System.out.println("	Colisões:\n	"
					+ 	"	com desenvolvedores = "+planetas.get(i).nColisoesDev+"\n"+
						"		com bugs            = "+planetas.get(i).nColisoesBug);
			
			
		}
		System.out.println("\nO usuário entrou com novos valores"+this.qtdeMomentos+" vezes.");
		System.out.println("Tempo total: "+this.tempoTotal+" anos");
		
	}
	
}
