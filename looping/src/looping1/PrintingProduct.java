package looping1;

import java.util.Scanner;

public class PrintingProduct {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*
		 using recursion
		int prod=1;
		for(int i=1;i<=n;i++) {
			prod*=i;
		}
		System.out.println("product of all numbers is: "+prod);
		*/
		System.out.println(fact(n));

	}
	// using recursion
	static int fact(int n) {
		if(n==0)
			return 1;
		return fact(n-1)*n;
	}

}
