package u4_d3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		stampaStringa();
		
	}

	public static void stampaStringa() {
		Scanner scannerNumero = new Scanner(System.in);
		System.out.println("inserisci un numero intero");
		int valore = scannerNumero.nextInt();

		switch (valore) {

		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("il numero è maggiore di tre");
			
		}
		scannerNumero.close();
	}
	

}
