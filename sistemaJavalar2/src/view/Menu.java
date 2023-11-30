package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Menu extends JPanel{
	
	public Botao botao1;
	public Botao botao2;
	public Botao botao3;
	public Botao botao4;
	public Botao botao5;
	
	public Menu(Painel p) {
		
		
		this.botao1 = new Botao("Processar próximo instante");
		this.botao2 = new Botao("Ler novo arquivo de entrada");
		this.botao3 = new Botao("Gravar relatório");
		this.botao4 = new Botao("Ler dados de outros participantes");
		this.botao5 = new Botao("Gravar arquivo de saída");
        
     
       
        
        this.add(botao1);
        this.add(botao2);
        this.add(botao3);
        this.add(botao4);
        this.add(botao5);
        
        this.setBackground(Color.LIGHT_GRAY);
        setBorder(new EmptyBorder(30, 30, 10, 30));
        this.setLayout(new GridLayout(5,1, 10,10));
		this.setSize(500,500);
        this.setVisible(true);
	}
}
