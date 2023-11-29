package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControladorDeArquivo;
import controller.Corpo;

public class Seleciona extends JFrame{
	
	public ControladorDeArquivo controle;
	public ArrayList<Corpo> planetas;
	
	public Seleciona(ControladorDeArquivo controle, ArrayList<Corpo> planetas) {
		this.controle = controle;
		this.planetas = planetas;
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocation(500, 200);
		this.setLayout(new GridLayout(6,1));
		
		Botao bt1 = new Botao("10 linhas");
		Botao bt2 = new Botao("100 linhas"); 
		Botao bt3 = new Botao("1000 linhas"); 
		Botao bt4 = new Botao("1500 linhas");
		Botao bt5 = new Botao("2000 linhas");
//		adicionando evento ao botao1
		bt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle.atualiza("C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_10.csv",planetas);
				dispose();
			}

		});
//		adicionando evento ao botao2
		bt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle.atualiza("C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_100.csv",planetas);
				
				dispose();
				
				
			}

		});
		
		bt3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle.atualiza("C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_1000.csv",planetas);
				
				dispose();
				
				
			}

		});
		bt4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle.atualiza("C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_1500.csv",planetas);
				
				dispose();
				
				
			}

		});
		bt5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle.atualiza("C:\\Users\\Felipe\\eclipse-workspace\\sistemaJavalar2\\src\\model\\AE_2000.csv",planetas);
				
				dispose();
				
				
			}

		});
		
		
		this.add(new JLabel("Selecione um Arquivo:"));
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
	}
}
