package controller;

public class C extends Corpo{
	public C(int velocidade) {
		super(velocidade, 7, 0.1f, "C");
	}
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " C é uma linguagem de programação compilada de propósito geral, estruturada, imperativa,\n"
				+ " procedural, padronizada pela Organização Internacional para Padronização, criada em 1972\n"
				+ " por Dennis Ritchie na empresa AT&T Bell Labs para desenvolvimento do sistema operacional\n"
				+ " Unix");
	}
}
