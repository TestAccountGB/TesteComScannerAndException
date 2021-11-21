package test;

import metodos.Scan;

public class Test {
	//private static Scan scan = new Scan();
	
	public static void main(String[] args) {
		
		try(Scan scan = new Scan()) {//Pra falar a verdade eu nao boto muito fe nisso aqui nao kk
			scan.useDelimiter("\r\n");
			System.out.println("DIgite um Número: ");
			int numero = scan.scanInt();
			
			System.out.println("Seu Número +3: " + (numero + 3));
			
			System.out.println("Char: ");
			char Char = scan.scanChar();
			System.out.println(Char);
			
		} 
//		finally {
//			scan.close();
//		}
		//Ou seja, o scanner sempre vai fechar, nao importa o que acontecer, recomendo muito sempre fazer isso,
		//E so colocar sempre na main, que e sucesso xD

	}
}