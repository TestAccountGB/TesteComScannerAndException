package metodos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Scan implements AutoCloseable {
	private Scanner scan = new Scanner(System.in);
	
	public int scanInt() {
		int Int;

		while (true) {
			try {
				Int = scan.nextInt();
				return Int;
			} catch (InputMismatchException e) {
				System.out.println("Digite um Número Inteiro.");
				scan.next();
			}
		}
	}

	public char scanChar() {
		char Char;

		while (true) {
			String aux = scan.next();
			if (aux.length() == 1) {
				Char = aux.charAt(0);
				return Char;
			} else {
				System.out.println("Digite apenas um caractere");
			}
		}
	}
	
/////////////////////////Metodos do scanner convencional
	
	public String next() {
		String string = scan.next();
		return string;
	}
	
	public void close() {
		scan.close();
	}
	
	public void useDelimiter(String pattern) {
		scan.useDelimiter(pattern);
	}
	
	public void useDelimiter(Pattern pattern) {
		scan.useDelimiter(pattern);
	}
	
	public void useLocale(Locale locale) {
		scan.useLocale(locale);
	}
}