package startingjava;

import java.util.Scanner;

public class örnek2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	
		for (int i =0;i<4;i++) {
		System.out.println("1.Sayıyı giriniz: ");
		int sayi1 = scan.nextInt();

		System.out.println("2.sayıyı giriniz: ");
		int sayi2 = scan.nextInt();

		System.out.println("1.Toplama " + "2.Çıkarma" + "3.Çarpma" + "4.Bölme");
		int menu = scan.nextInt();

		switch (menu) {

		case 1:
System.out.println("Toplam : " + sayi1+sayi2);
			break;

		case 2:
			System.out.println("Çıkarma : " + (sayi1-sayi2));

			break;
		case 3:
			System.out.println("Çarpma : " + sayi1*sayi2);

			break;
		case 4:
			System.out.println("Bölme : " + sayi1/sayi2);

			break;
		}
		}
	}

}
