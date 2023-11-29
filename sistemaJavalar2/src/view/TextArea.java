package view;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JPanel{
	public TextArea(String txt) {
		this.setLayout(new GridLayout(2,2));
		String textoLongo = txt;
        JTextArea textArea = new JTextArea(textoLongo);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(textArea);
        add(scrollPane);
	}
}
