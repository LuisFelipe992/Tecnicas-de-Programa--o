package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextArea extends JPanel {
    public TextArea(String txt) {
        this.setLayout(new GridLayout(1, 1));

        String textoLongo = txt;
        JTextArea textArea = new JTextArea(textoLongo);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Defina um tamanho preferencial para o JTextArea
        textArea.setPreferredSize(new Dimension(300, 200));

        // Adicione apenas o JScrollPane ao painel
        add(scrollPane);
    }
}
