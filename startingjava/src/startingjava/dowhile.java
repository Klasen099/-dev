package startingjava;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int i = scan.nextInt();
	int toplam = 0;	
		do {
			toplam += i%10;
			i = i/10;
			

	

 
		} while (i>0);
		
		System.out.println("Toplam = " +toplam);
		
		
		
		
		
		
		
		
	}

}
