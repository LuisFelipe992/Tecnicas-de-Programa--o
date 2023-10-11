package sistemaJavalar;

public class Php extends Corpo {
	public Php(int velocidade) {
		super(velocidade, 4, 60, "Php");
	}
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " PHP é uma linguagem interpretada livre, usada originalmente apenas para o\n"
				+ " desenvolvimento de aplicações presentes e atuantes no lado do servidor, capazes\n"
				+ " de gerar conteúdo dinâmico na World Wide Web. Entre os fatores que fizeram o PHP\n"
				+ " se popularizar bastante é possível apontar, principalmente, o fato de ser em \n"
				+ " código aberto");
	}
}
