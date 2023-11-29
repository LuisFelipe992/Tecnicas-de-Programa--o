package controller;

public class Csharp extends Corpo{
	public Csharp(int velocidade) {
		super(velocidade, 5, 4, "C#");
	}
	
	public void sobre() {
		System.out.println("Sobre:\n"
				+ " C# é uma linguagem de programação, multiparadigma, de tipagem forte, desenvolvida\n"
				+ " pela Microsoft como parte da plataforma .NET. A sua sintaxe orientada a objetos foi\n"
				+ " baseada no C++ mas inclui muitas influências de outras linguagens de programação,\n"
				+ " como Object Pascal e, principalmente, Java.");
	}
}
