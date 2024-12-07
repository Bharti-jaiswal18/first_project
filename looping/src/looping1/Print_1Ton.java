package looping1;

import java.util.Scanner;

public class Print_1Ton {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
		
		for(int i=n;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
