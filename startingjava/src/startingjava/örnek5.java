package startingjava;

import java.util.Scanner;

public class örnek5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 1;

		int toplam = 100;

		while (i < toplam) {

			i++;

			if (i % 2 == 0) {

				System.out.println(i);

			}
		}
	}
}
