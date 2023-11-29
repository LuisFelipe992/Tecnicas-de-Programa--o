package controller;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.tree.ExpandVetoException;

import model.Arquivo;

public class ControladorDeArquivo {
	
	public JButton botao;
	public Arquivo arquivo;
	public ArrayList<String> txtArquivo;
	public int numLinha;
	public Main main; 
	public String caminho = "C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_10.csv";
	
	//construtor
	public ControladorDeArquivo() {
		this.numLinha = 1;
		this.arquivo = new Arquivo();
		this.txtArquivo = this.arquivo.lerArquivo(this.caminho); 
	}
	
	//chamado quando alguem clicar no botao
	public void recebeBotao(JButton b) {
		this.botao = b;
		this.retornaNextLinha();
	}
	
	public void atualiza(String str, ArrayList<Corpo> planetas) {
		this.arquivo = new Arquivo();
		this.caminho = str;
		this.numLinha = 0;
		this.txtArquivo = this.arquivo.lerArquivo(this.caminho); 
		
		//reiniciando as posições dos planetas
		for(int i = 0; i< planetas.size(); i++) {
			planetas.get(i).y = 7-planetas.get(i).dist;
			planetas.get(i).x = 7;
		}
		
	}
	
	//retorna uma linha
	public String retornaNextLinha() {
		
			try {
				this.numLinha++;
				return this.txtArquivo.get(numLinha);
				
				
			}catch(Exception e) {
				
			}
			
		return "0";
	}
}
