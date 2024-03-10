package startingjava;

import java.util.Scanner;

public class WHİLE {

	public static void main(String[] args) {

		
	Scanner scan = new Scanner(System.in);	
	
	
	
	
	
	
	
	
	
	 
	System.out.println("Bir sayı giriniz: ");
	int i = scan.nextInt();
	int faktoriyel = 1 ;
	
	while (i>0) {
		
		
		faktoriyel = faktoriyel*i;
		i--;
		
	}
		System.out.println(faktoriyel);
 
	}}
