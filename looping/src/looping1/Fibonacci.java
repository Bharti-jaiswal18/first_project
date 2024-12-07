package looping1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*
		int a=0,b=1;
		//upto n terms
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		//tc O(n)
		*/
		System.out.println("printing fibonacci:");
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
		System.out.println();
		//tc is:O(2^n)
	}
	static int fib(int n) {
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}

}
