package sistemaJavalar;

public class Javascript extends Corpo {
	public Javascript( int velocidade) {
		super(velocidade, 2,10, "javascript");
		
	}
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " JavaScript é uma linguagem de programação interpretada estruturada, de script\n"
				+ " em alto nível com tipagem dinâmica fraca e multiparadigma. Juntamente com HTML\n"
				+ " e CSS, o JavaScript é uma das três principais tecnologias da World Wide Web.\n"
				+ " surgiu como uma tecnologia do lado do navegador para tornar as aplicações Web \n"
				+ " mais dinâmicas. Ao usar JavaScript, os navegadores passaram a ser capazes de \n"
				+ " responder a interações do usuário e alterar o layout do conteúdo na página.");
	}
}
