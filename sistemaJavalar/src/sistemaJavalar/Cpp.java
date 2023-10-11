package sistemaJavalar;

public class Cpp extends Corpo{
	public Cpp(int velocidade) {
		super(velocidade, 6, 0.5f, "C++");
	}
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " C++ é uma linguagem de uso geral que permite acesso a recursos de baixo nível como\n"
				+ " ponteiros e recursos de alto nível como construção de novos tipos usando orientação\n"
				+ " a objetos (classes) e recursos de programação genérica (templates). Podemos descrever\n"
				+ " C++ por duas palavras: elegância e performance.");
	}
}
