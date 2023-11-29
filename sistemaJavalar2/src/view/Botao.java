package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Botao extends JButton {
	
	public Botao(String txt) {
		this.setText(txt);
		this.setBackground(Color.orange);
		this.setForeground(Color.black);
		this.setFont( new Font("Arial",Font.BOLD, 22));
		
	}


}
