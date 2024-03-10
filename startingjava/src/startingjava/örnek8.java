package startingjava;

import java.util.Scanner;

public class örnek8 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int toplam=1;
		System.out.println("Sayi giriniz:");
		int sayi = scan.nextInt();
		
		while(sayi>0) {
			
//sayi*=f;
			
			toplam = toplam*sayi;
			sayi--;

			
		}
		System.out.println(toplam);

	}

}
