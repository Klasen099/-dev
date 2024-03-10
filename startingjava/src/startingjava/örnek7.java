package startingjava;

import java.util.Scanner;

public class örnek7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i =0;
		while (true) {


			
			System.out.println("Sayi giriniz: ");
			int number = scan.nextInt();
			
			
			if(number<0) {
				
				System.out.println("Program bitti");
				System.out.println(i);
				break;
			}
			if(number%2==1) {
				i+=number;
				
			}
	}

}	}