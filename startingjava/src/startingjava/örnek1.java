package startingjava;

import java.util.Scanner;

public class örnek1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int i = 3; i >= 0; i--) {

			String pas = "1235";
			System.out.println("Şifre giriniz: ");
			String pass = scan.next();

			if (pas.equals(pass)) {
				System.out.println("Şifre doğru ");

			} else {
				System.out.println("Şifre yanlış Kalan Hakkınız:  " + i);

			}
			if (i == 0) {
				System.out.println("Kalan hakkınız bitti.. ");
				break;

			}

		}
	}

}
