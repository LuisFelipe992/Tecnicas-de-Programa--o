package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ControladorDeArquivo;
import controller.Corpo;
import controller.Sistema;
import controller.UFO;
import model.Banco;


public class Janela extends JFrame{
	
	
	//precisa chegar as posicoes x e y dos objetos neste contexto!
	public Painel showPlanet;
	public JPanel tPainel = new JPanel();
	public ControladorDeArquivo controle;
	public Menu menu ;
	public ArrayList<Corpo> planetas;
	public ArrayList<UFO> dev;
	public ArrayList<UFO> bug;
	public Sistema sistema;
	public String txtLinhas ;
	public Banco javalar;
	public String[] txt;
	
	public Janela( ArrayList<Corpo> planetas,ArrayList<UFO> bug, ArrayList<UFO> dev, Banco javalar) {
		this.javalar = javalar;
		this.planetas = planetas;
		this.dev = dev;
		this.bug = bug;
		this.showPlanet = new Painel(this.planetas, this.dev, this.bug);
		this.menu = new Menu(this.showPlanet);
		this.tPainel.setLayout(new GridLayout(1,2));
		this.controle = new ControladorDeArquivo() ;
		this.txtLinhas = this.controle.retornaNextLinha() ;
		setLayout(new BorderLayout());
		this.sistema = new Sistema(this.planetas,this.dev,this.bug);
		
		// adicionando o painel de visualização
	    tPainel.add(showPlanet);
	    tPainel.add(this.menu);
	    this.add(tPainel);
	    
	    this.setSize(1220, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.menu.botao1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	
		    	txtLinhas = controle.retornaNextLinha() ; 
		    	String[] aux = txtLinhas.split(",");
		    	for(int i = 0; i<aux.length; i++) {
		    		if(i<7) {
		    			sistema.tempo = Integer.parseInt(aux[i+1]);
			    		sistema.passaTempo(planetas.get(i));
		    		}else if(i == 8) {
		    			sistema.setDev(Integer.parseInt(aux[i]),dev);
		    		}else if(i==9) {
		    			sistema.setBug(Integer.parseInt(aux[i]), bug);
		    		}
		    		
		    	}
		    	sistema.verificaColisao();
		    	sistema.colisoes();
		    	showPlanet.posiciona(planetas);
		    }

		});
		
		this.menu.botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame select = new Seleciona(controle,planetas);
				
				for(int i = 0; i<planetas.size(); i++) {
					planetas.get(i).resetaPosi();
				}
				bug.clear();
				dev.clear();
				showPlanet.posiciona(planetas);
			}
		});
		
		
		this.menu.botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				javalar.gravaRelatorio(planetas, dev, bug);
			}
		});
		
		
		this.menu.botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFrame janela = new JFrame("banco informe");
				janela.add(new TextArea(javalar.selecionarTodasPessoas()));
				
				
				janela.setSize(300, 200);
				janela.setResizable(false);
				janela.setVisible(true);
				janela.setLocation(500, 200);
			}
		});
	}
}
