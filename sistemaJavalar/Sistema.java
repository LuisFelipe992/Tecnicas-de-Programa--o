package sistemaJavalar;

import java.util.Scanner;

public class Sistema {
	private int tempo;
	public EstrelaJava estrela;
	
	public Sistema(EstrelaJava estrela) {
		this.estrela = estrela;
	}
	
	
	public void setTempo(int tempo) {
		if (tempo>=0) {
			this.tempo = tempo;
		}
	}
	
	public int getTempo() {
		return this.tempo;
	}
	
	// Passa o tempo setado pelo usuario para reorganizar os planetas
	public void passaTempo(Corpo py, Corpo js, Corpo ror, Corpo php, Corpo csharp, Corpo cpp, Corpo c ) {
		py.move(this.estrela, this.tempo*py.getVel());
		js.move(this.estrela, this.tempo*js.getVel());
		ror.move(this.estrela, this.tempo*js.getVel());
		php.move(this.estrela, this.tempo*js.getVel());
		csharp.move(this.estrela, this.tempo*js.getVel());
		cpp.move(this.estrela, this.tempo*js.getVel());
		c.move(this.estrela, this.tempo*js.getVel());
		
	}
	public void passaDia(Corpo py, Corpo js, Corpo ror, Corpo php, Corpo csharp, Corpo cpp, Corpo c) {
		
	}
	
	public void relatorio(Corpo planetaPy, Corpo planetaJs, Corpo planetaROR, Corpo php, Corpo csharp, Corpo cpp, Corpo c) {
		planetaPy.desc();
		planetaJs.desc();
		planetaROR.desc();
		php.desc();
		csharp.desc();
		cpp.desc();
		c.desc();
	}
}
