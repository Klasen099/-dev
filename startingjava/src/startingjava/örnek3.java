package startingjava;

import java.util.Scanner;

public class örnek3 {

	public static void main(String[] args) {

		
		Scanner scan =new  Scanner(System.in);
		
	
	
	
		for (int i =0;i<10;i++) {
			
			System.out.print("");
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}

}
}