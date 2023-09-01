package condicionais;

public class Main {
	
	public static int A = 12;
	public static int B = 14;
	
	public static void main(String[] args) {
		q1();

	}
	
	public static void q1() {
		/*1) Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
		segunda afirmação não seja verdadeira, imprima: "número não válido".*/
		
		if(A>10)
			System.out.println("A > 10");
		
		if(A+B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("número não válido");
	}
	
	public static void q2() {
		/*Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
		se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
		nenhumas das afirmação não seja verdadeira, imprima: "número não
		válido", (obs: apenas uma impressão é permitida na saída do programa).
		 */
		
		if(A < 10){
			System.out.println("A < 10");
		}else if (A+B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("número não válido!");
	}

	public static void q3() {
		/*
		 * 3) Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
			se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
			se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
			impressões são permitidas na saída do programa).
		 */
		
		if(A == 10)
			System.out.println("A == 10");
		if(A + B == 20)
			System.out.println("A + B == 20");
		if(B == 10)
			System.out.println("B == 10");
	}
	
	public static void q4() {
		/*
		 * Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
			imprima: "número válido". Caso as afirmações não sejam verdadeiras,
			Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
			diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"			número não válido".*/
		
		if(A > 10 || A+B == 20)
			System.out.println("número válido!");
		else if(A == B)
			System.out.println("A é igual B; A e B são diferentes de 10; A é menor que 10");
		else
			System.out.println("número não válido!");
	}
	
	public static void q5() {
		/*
		 *  Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
			imprima: "número válido". Caso as afirmações não sejam verdadeiras,
			imprima: "número não válido".
		 */
		
		if(A > 10 || A+B == 20)
			System.out.println("número válido!");
		else
			System.out.println("número não válido!");
	}
	
	public static void q6() {
		/*
		 * Verifique se A é maior que 10, se verdade imprima: "A > 10" caso não
			seja, imprima: "A <= 10". Verifique se A mais B é igual a 20, se
			verdadeiro, imprima: "A + B == 20”, caso não seja imprima: “A + B !=
20”.
		 * */
		
		if(A > 10)
			System.out.println("A > 10");
		else
			System.out.println("A <= 10");
		if(A+B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("A + B != 20");
	}
	
	public static void q7() {
		/*Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
		verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
		afirmação não seja verdadeira, imprima: "número não válido".*/
		
		if(A > 10 || A+B == 20)
			System.out.println("Números válido!");
		else
			System.out.println("números não válidos!");
		
	}
	
	public static void q8() {
		/*Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
		se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
		for verdade: imprima "número não válido ".*/

		if(A>10)
			System.out.println("A > 10");
		if(A+B == 20)
			System.out.println("A + B ==  20");
		else 
			System.out.println("Numero não válido!");
	}
	
	public static void q9() {
		/*Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
		verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
		verdadeiras imprima: "número não válido".*/
		
		if(A > 10 && A+B == 20)
			System.out.println("A+B == 20");
		else 
			System.out.println("Númeo não válido!");
	}
	
	public static void q10() {
		/*10)Verifique se A é maior que 10 se não for imprima: "número menor que
		10". Verifique se A mais B é igual a 20 se não for verdade imprima
		"número diferente de 20".*/

		if(A>10)
			System.out.println("");
		else
			System.out.println("número menor que 10");
		if(A+B == 20)
			System.out.println("");
		else 
			System.out.println("número diferente de 20!");
	}
	
	public static void q11() {
		/*11)Verifique se A é maior que 10 se não for verifique se A mais B é igual a
		20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
		for diferente de 20, imprima: "número não válido".*/
		
		if(A>10)
			System.out.println("");
		else if(A+B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("número inválido!");
		
	}
	
	public static void q12() {
		/*Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
		B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
		verdadeiras, imprima: "números não válidos". Sejam as afirmações
		anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
		disciplina de Técnicas de Programação”.*/
		
		if(A>10)
			System.out.println("A > 10");
		else if(A + B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("números não válidos!");
		System.out.println("Sejam bem-vidos à disiplina de técnicas de programação!");
		
	}
	
	public static void q13() {
		/*Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
		verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
		Caso as afirmações não sejam verdadeiras, imprima: "números não
		válidos".*/
		
		if(A > 10)
			System.out.println("A > 10");
		else if(A + B == 20)
			System.out.println("A + B == 20");
		else
			System.out.println("números não válidos!");
	}
	
	public static void q14() {
		/*Verifique se o valor de A é maior que 10. Se for verdade, imprima "A >
		10". Além disso, verifique se a soma de A e B é igual a 20. Se essa
		afirmação também for verdadeira, imprima "A + B == 20". Caso a
		segunda afirmação não seja verdadeira, imprima "número não válido".*/
		if (A > 10)
			System.out.println("A > 10");
		if(A+B == 20)
			System.out.println("A+B == 20");
		else 
			System.out.println("número não válido!");
	}
	
	public static void q15() {
		/*15)Verifique se o valor de A é menor que 10. Se essa afirmação for
		verdadeira, imprima "A < 10". Em seguida, verifique se a soma de A e B
		é igual a 20. Se essa afirmação for verdadeira, imprima "A + B == 20".
		Caso nenhuma das afirmações seja verdadeira, imprima "número não
		válido".*/
		
		if(A<10)
			System.out.println("A<10");
		else if(A+B == 20)
			System.out.println("A + B == 20");
		else 
			System.out.println("Número não válido!");
	}
	
	public static void q16() {
		/*Verifique se o valor de A é igual a 10. Se essa afirmação for verdadeira,
		imprima "A == 10". Em seguida, verifique se a soma de A e B é igual a
		20. Se essa afirmação for verdadeira, imprima "A + B == 20". Depois
		disso, verifique se o valor de B é igual a 10. Se essa afirmação for
		verdadeira, imprima "B == 10".*/
		
		if(A == 10)
			System.out.println("A == 10");
		if(A +B == 20)
			System.out.println("A + B == 20");
		if(B == 10)
			System.out.println("B == 10");
	}
	
	public static void q17() {
		/*Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
		a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
		"número válido". Caso contrário, verifique se A é igual a B. Se for
		verdade, imprima "A é igual B". Se A e B forem diferentes de 10 e A for
		menor que 10, imprima "A é menor que 10". Caso nenhuma das
		afirmações anteriores seja verdadeira, imprima "número não válido".*/
		
		if(A > 10 || A+B ==20)
			System.out.println("número válido!");
		else if(A == B)
			System.out.println("A == B");
		else if(A != 10 && B != 10 && A < 10)
			System.out.println("A é menor que 10");
		else 
			System.out.println("número não válido");
	}
	
	public static void q18() {
		/*18)Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual a
		20. Se pelo menos uma dessas afirmações for verdadeira, imprima
		"número válido". Caso contrário, imprima "número não válido".*/
		
		if(A > 10 || A+B == 20)
			System.out.println("número válido");
		else 
			System.out.println("número não válido");
			
	}
	
	public static void q19() {
		/*19)Verifique se o valor de A é maior que 10. Se for verdade, imprima "A >
		10". Caso contrário, imprima "A <= 10". Em seguida, verifique se a soma
		de A e B é igual a 20. Se essa afirmação for verdadeira, imprima "A + B
		== 20". Caso contrário, imprima "A + B != 20".*/
		
		if(A > 10)
			System.out.println("A > 10");
		else
			System.out.println("A <= 10");
		if(A+B == 20)
			System.out.println("A+B == 20");
		else
			System.out.println("A+B != 20");
	}
	
	public static void q20() {
		/*Verifique se o valor de A é maior que 10 ou se a soma de A e B é igual
		a 20. Se pelo menos uma dessas afirmações for verdadeira, imprima
		"números válidos". Caso contrário, imprima "número não válido". Em
		qualquer caso, imprima "Sejam bem-vindos à disciplina de Técnicas de
		Programação".*/
		
		if(A > 10 || A+B == 20)
			System.out.println("números válidos!");
		else
			System.out.println("números não válidos!");
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
	}
}
