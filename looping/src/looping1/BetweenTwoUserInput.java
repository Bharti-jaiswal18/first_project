package looping1;

import java.util.Scanner;

public class BetweenTwoUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int m=sc.nextInt();
		System.out.println("Enter second number greater than first");
		int n=sc.nextInt();
		//forward
		System.out.println("forward");
		for(int i=m;i<=n;i++) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		//backward
		System.out.println("backward");
		for(int i=n;i>=m;i--) {
			System.out.print(i+" ");
		}
		System.out.println();

	}

}
