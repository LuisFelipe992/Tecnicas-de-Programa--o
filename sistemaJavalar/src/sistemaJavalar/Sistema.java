package sistemaJavalar;

import java.util.Scanner;
import java.util.ArrayList;

// classe para gerenciar as entradas de dados pelo usuário
public class Sistema {
	private int tempo;
	public EstrelaJava estrela;
	public int tempoTotal;
	public int qtdeMomentos; // quantas vezes o usuario entrou com dados
	
	//construtor
	public Sistema(EstrelaJava estrela) {
		this.estrela = estrela;
	}
	
	
	public void setTempo(int tempo) {
		if (tempo>=0) {
			this.tempo = tempo;
			this.tempoTotal+=this.tempo;
			this.qtdeMomentos++;
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
		planeta.move(this.estrela, this.tempo*planeta.getVel());
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
			planetas.get(i).sobre();
			
		}
		System.out.println("\nO usuário entrou com novos valores"+this.qtdeMomentos+" vezes.");
		System.out.println("Tempo total: "+this.tempoTotal+" anos");
		
	}
	
}
