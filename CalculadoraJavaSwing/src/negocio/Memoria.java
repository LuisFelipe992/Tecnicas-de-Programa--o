package negocio;

import java.util.ArrayList;

public class Memoria {

	private ArrayList<String> numeros;

	public Memoria() {
		numeros = new ArrayList<String>();
	}

	public String getNumeros() {
		String resultado = "";
		String resultado2 = "";
		float parcela1=0;
		float parcela2=0;
		String op="";
		int poseOp =0;

		for (int i = 0; i<numeros.size();i++) {
			if((numeros.get(i) == "+" || numeros.get(i) == "-" ||numeros.get(i) == "*" || numeros.get(i) == "/")) {
				parcela1 = Float.valueOf(resultado);
				op = numeros.get(i);
				poseOp = i;
				resultado2="";
			}
			resultado += ""+ numeros.get(i);	
			
			if(numeros.get(i)=="=") {
				resultado2 = resultado2.substring(1);    
				parcela2 = Float.valueOf(resultado2); 
				System.out.println(parcela1+op+parcela2);
				if(op.equals("+"))
					resultado += ""+(parcela1+parcela2);
				else if(op.equals("-"))
					resultado += ""+(parcela1-parcela2);
				else if(op.equals("*"))
					resultado += ""+(parcela1*parcela2);
				else if(op.equals("/"))
					resultado += ""+(parcela1/parcela2);
			}
			resultado2 += ""+ numeros.get(i);
					
			
		}
		
		resultado +="";
		return resultado;
	}
	
//	primeiraParte opera��o segundaParte =  resultado
	
	public void setNumero(String numero) {
		
		if(numero.equals("="))
			System.out.println(" igual");
		numeros.add(numero);
	}

}
