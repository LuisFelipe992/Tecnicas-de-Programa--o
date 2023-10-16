package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import negocio.Memoria;

public class Teclado extends JPanel implements ActionListener {

	private Memoria memoria;
	private Display display;
	
	public Teclado(Memoria memoria, Display display) {

		this.memoria = memoria;
		this.display = display;
				
		setLayout(new GridLayout(4, 4));
		setBackground(Color.lightGray);

		add(criarBotao("7", Color.white));
		add(criarBotao("8", Color.white));
		add(criarBotao("9", Color.white));
		add(criarBotao("+", Color.lightGray));
		
		add(criarBotao("4", Color.white));
		add(criarBotao("5", Color.white));
		add(criarBotao("6", Color.white));
		add(criarBotao("-", Color.lightGray));
		
		add(criarBotao("1", Color.white));
		add(criarBotao("2", Color.white));
		add(criarBotao("3", Color.white));
		add(criarBotao("*", Color.lightGray));
		
		add(criarBotao("0", Color.white));
		add(criarBotao("/", Color.lightGray));
		add(criarBotao(".", Color.lightGray));
		add(criarBotao("=", Color.green));
		

	}

	public Botao criarBotao(String texto, Color cor) {

		Botao b = new Botao(texto, cor);
		b.addActionListener(this);
		return b;
	}


	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		 memoria.setNumero(b.getText());
		display.setLabel(memoria.getNumeros());
        
	}
	
	

}
