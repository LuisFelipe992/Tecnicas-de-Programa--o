package cachorroQuente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barraca barracaDaArvore = new Barraca();
		
		Aluno aluno1 = new Aluno("Luis Felipe", 556762);
		
		CachorroQuente c1 = new CachorroQuente("salsicha","parmesão","coca");
		c1.setAdicional(true, true, false, true);
		
		barracaDaArvore.vender(aluno1.nome, c1);
	}

}
