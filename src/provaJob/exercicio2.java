package provaJob;

import java.util.Scanner;

public class exercicio2 {
	public static void main (String[] args) {
		int a=0, b=1, c=0;
		Scanner in = new Scanner(System.in);
		System.out.println("digite um numero e descubra se ele faz parte da sequencia de fibonatti");
		int	n = in.nextInt();			
			do {			
			c=a+b;
			a=b;
			b=c;
			if(n == c) {
				System.out.println("o numero : " + n +" faz parte da sequencia de fibonatti");
				break;
			}			
			}while(n>=c);				
			if (c!=n) {
				System.out.println("o numero : " + n +" não faz parte da sequencia de fibonatti");
			}	
	}
}
