package startingjava;

import java.util.Scanner;

public class örnek6 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in); 
	
		System.out.println("Sayı giriniz: ");
		int number = scan.nextInt();
		int i = 1;
		
		while (i<number) {
			i++;
			
			int j =i*i;
			System.out.println(j);
			
			
 		}
		
		
	}

}
