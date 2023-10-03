package sistemaJavalar;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//instancias de corpos celestes
				
		EstrelaJava estrela = new EstrelaJava();
		
		Sistema sistema = new Sistema(estrela);
		
		// Planetas
		ArrayList<Corpo> planetas = new ArrayList<>() ;
		planetas.add(new Python(4));
		planetas.add(new Javascript(3));
		planetas.add(new RubyOnRails(2));
		planetas.add(new Php(2));
		planetas.add(new Csharp(1));
		planetas.add(new Cpp(2));
		planetas.add(new C(10));
		
		//Entrada
		Scanner entrada = new Scanner(System.in);
		
		//UFOs bugs e desenvolvedores
		ArrayList<UFO> bug = new ArrayList<>();
		ArrayList<UFO> dev = new ArrayList<>();
		
		menu(entrada, sistema, planetas, dev, bug);
	}
	
	
	//menu do usuario
	public static void menu(Scanner entrada, Sistema sistema, ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug ) {
		int qtdePlanetas = planetas.size();
		System.out.println("digite uma quantidade de tempo em anos terrestres: ");
		sistema.setTempo( entrada.nextInt());
		
		System.out.println("digite uma quantidade de desenvolvedores: ");
		sistema.setDev( entrada.nextInt(),dev);
		
		System.out.println("digite uma quantidade de Bugs: ");
		sistema.setBug( entrada.nextInt(),bug);
		// verifica colisao com planetas
		for(int i = 0; i<bug.size(); i++) {
			bug.get(i).verificaPosicao(planetas);
		}
		for(int i = 0; i<dev.size(); i++) {
			dev.get(i).verificaPosicao(planetas);
		}
		for(int i = 0; i < planetas.size(); i++ ) {
			planetas.get(i).colisao(bug);
			planetas.get(i).colisao(dev);
			sistema.removePlaneta(planetas);
			sistema.passaTempo(planetas.get(i));
			sistema.relatorio(planetas.get(i));
		}
		
		for(int i = 0; i<dev.size(); i++) {
			if(dev.get(i).colidiu)
				dev.remove(i);
			else
				dev.get(i).desc();
		}
		for(int i = 0; i<bug.size(); i++) {
			if(bug.get(i).colidiu)
				bug.remove(i);
			else
				bug.get(i).desc();
		}
		
		//////////////
		System.out.println("Bugs            = "+bug.size());
		System.out.println("Desenvolvedores = "+dev.size());
		if(planetas.size()<qtdePlanetas) {
			System.out.println(planetas.size()-qtdePlanetas+" planeta(s) explodiu!!");
			qtdePlanetas = planetas.size();
		}
		
		int continua;
		System.out.println("deseja continuar? (1-sim; 2- não)");
		continua =  entrada.nextInt();
		switch(continua) {
		case 1:
			menu(entrada, sistema, planetas, dev, bug);
			break;
		case 2:
			System.out.println("finalizando...");
			break;
		default:	
		}
	}
}
