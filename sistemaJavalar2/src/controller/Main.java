package controller;

import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Banco;
import view.Janela;
import view.Painel;

import java.awt.GridLayout;
import java.util.ArrayList;

public class Main extends JFrame {
	
	//instancias de corpos celestes
	
	public EstrelaJava estrela = new EstrelaJava();
			
	public Sistema sistema ;
			
	// Planetas
	public ArrayList<Corpo> planetas = new ArrayList<>() ;
	
	public JFrame janela;
	
		
	public Main(){

		//UFOs bugs e desenvolvedores
		ArrayList<UFO> bug = new ArrayList<>();
		ArrayList<UFO> dev = new ArrayList<>();
		
		// Bancon de dados
		Banco javalar= new Banco();
		
		
		this.planetas.add(new Python(4));
		this.planetas.add(new Javascript(3));
		this.planetas.add(new RubyOnRails(2));
		this.planetas.add(new Php(2));
		this.planetas.add(new Csharp(1));
		this.planetas.add(new Cpp(2));
		this.planetas.add(new C(10));
		this.janela = new Janela(planetas, bug, dev, javalar);
		
		//Entrada
		Scanner entrada = new Scanner(System.in);
		
		
		
	}
	
	public static void main(String[] args) {
		new Main();
		
	}
	//modifica posiçao quando clicar no botao
	public void modificaPosi(ArrayList<String> l) {
		//
		for(int i=0; i<l.size(); i++) {
			String[] linha = l.get(i).split(",");
		}
	}
	
	
	
	//menu do usuario NAO FUNCIONA MAIS... APENAS PARA PESQUISA
	public static void menu(Scanner entrada, Sistema sistema, ArrayList<Corpo> planetas, ArrayList<UFO> dev, ArrayList<UFO> bug ) {
		int qtdePlanetas = planetas.size();
		
		/*
		 * 	entrada de dados do usuario
		 * */
		System.out.println("digite uma quantidade de tempo em anos terrestres: ");
		sistema.setTempo( entrada.nextInt());
		
		System.out.println("digite uma quantidade de desenvolvedores: ");
		sistema.setDev( entrada.nextInt(),dev);
		
		System.out.println("digite uma quantidade de Bugs: ");
		sistema.setBug( entrada.nextInt(),bug);
		////////////////////////////////////////////////////////////////
		
		
		//////////////
		System.out.println("Bugs            = "+bug.size());
		System.out.println("Desenvolvedores = "+dev.size());
		
		int continua;
		
		/********
		 * Final da rodada!!
		 * */
		System.out.println("deseja continuar? (1-sim; 2- não)");
		continua =  entrada.nextInt();
		switch(continua) {
		case 1:
			menu(entrada, sistema, planetas, dev, bug);
			break;
		case 2:
			System.out.println("finalizando...");
			sistema.relatorio(planetas, dev, bug, qtdePlanetas);
			break;
		default:	
		}
	}
}
