package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//cada planeta ou objeto

public class ViewPlaneta extends JLabel{
	
	
		
	public ViewPlaneta(String txt) {
		this.setForeground(Color.white);
		this.setFont( new Font("Arial",Font.BOLD, 14));
		if(txt == "Java") {
			this.setForeground(Color.orange);
			this.setFont( new Font("Arial",Font.BOLD, 16));
		}else if(txt == "-") {
			this.setForeground(Color.red);
		}else if(txt == "+") {
			this.setForeground(Color.green);
		}
			
		this.setText(txt);
		
		this.setVisible(true);
	}
}
