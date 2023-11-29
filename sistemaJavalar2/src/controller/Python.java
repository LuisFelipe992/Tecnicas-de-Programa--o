package controller;

public class Python extends Corpo {
	public Python(int velocidade) {
		super(velocidade, 1, 24, "Python");
		
	}
	// resumo sobre o planeta
	public void sobre() {
		System.out.println("Sobre: \nPython é uma linguagem de programação de alto nível,\n"
								+ "interpretada de script, imperativa, orientada a objetos, funcional,\n"
								+ "de tipagem dinâmica e forte. Foi lançada por Guido van Rossum em 1991.\n"
								+ "É uma linguagem de programação amplamente usada em aplicações da Web,\n"
								+ "desenvolvimento de software, ciência de dados e machine learning (ML).\n"
								+ "Os desenvolvedores usam o Python porque é eficiente e fácil de aprender\n"
								+ "e pode ser executada em muitas plataformas diferentes.");
	}
}
