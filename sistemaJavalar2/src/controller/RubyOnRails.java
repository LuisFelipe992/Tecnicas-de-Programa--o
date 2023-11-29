package controller;

public class RubyOnRails extends Corpo {
	public RubyOnRails(int velocidade) {
		super(velocidade, 3, 48, "Ruby");
		
	}
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " Ruby on Rails é um framework livre, baseado na linguagem Ruby, que promete aumentar\n"
				+ " velocidade e facilidade no desenvolvimento de sites orientados a banco de dados,\n"
				+ " uma vez que é possível criar aplicações com base em estruturas pré-definidas.");
	}
}
