package looping1;

import java.util.Scanner;

public class PrintingSum {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		sum=n*(n+1)/2;
		System.out.println("summ of all number from 1 to n is: "+sum);
		

	}

}
