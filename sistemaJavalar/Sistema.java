package sistemaJavalar;

import java.util.Scanner;
import java.util.ArrayList;

// classe para gerenciar as entradas de dados pelo usuário
public class Sistema {
	private int tempo;
	public EstrelaJava estrela;
	
	
	//construtor
	public Sistema(EstrelaJava estrela) {
		this.estrela = estrela;
	}
	
	
	public void setTempo(int tempo) {
		if (tempo>=0) {
			this.tempo = tempo;
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
	
	
	public void relatorio(Corpo planeta) {
		planeta.desc();
	}
	
	public void removePlaneta(ArrayList<Corpo> p) {
		for(int i = 0; i<p.size(); i++) {
			if(p.get(i).getVel()==0) {
				System.out.println("planeta "+p.get(i).nome+" explodiu!");
				p.remove(i);
			}
		}
	}
}
