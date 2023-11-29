package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {
	
	public ArrayList<String> linhas = new ArrayList<String>();
	public String caminho;
	
	public Arquivo() {
		

        
	}
	
	public ArrayList<String> lerArquivo(String caminho){
		
		this.caminho = caminho;
		
		try {
            File arquivo = new File(this.caminho);

            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(arquivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String linha;

                // Lê cada linha do arquivo
                while ((linha = bufferedReader.readLine()) != null) {
                    this.linhas.add(linha);
                    
                }

                // Fecha os recursos
                bufferedReader.close();
                fileReader.close();
            } else {
                System.out.println("Arquivo não encontrado.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return linhas;
	}
}
