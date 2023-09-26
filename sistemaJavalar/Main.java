package sistemaJavalar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//instancias de corpos celestes
		
		Espaco espacoTempo = new Espaco();
		
		EstrelaJava estrela = new EstrelaJava();
		
		Sistema sistema = new Sistema(estrela);
		
		// Planetas
		Corpo planetaPy = new Python(4);
		
		Corpo planetaJs = new Javascript(3);
		
		Corpo planetaROR = new RubyOnRails(2);
		
		Corpo planetaPhp = new Php(2);
		
		Corpo planetaCsharp = new Csharp(1);
		
		Corpo planetaCpp = new Cpp(2);
		
		Corpo planetaC = new C(10);
		//Entrada
		Scanner entrada = new Scanner(System.in);
		
		
		/*
		 *  testes
		 * */
		
		System.out.println("digite a quantidade de tempo: ");
		sistema.setTempo( entrada.nextInt());
		sistema.passaTempo(planetaPy, planetaJs, planetaROR, planetaPhp, planetaCsharp, planetaCpp, planetaC);
		sistema.relatorio(planetaPy, planetaJs, planetaROR, planetaPhp, planetaCsharp, planetaCpp, planetaC);

			}

}
