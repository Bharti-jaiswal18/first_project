package looping1;

import java.util.Scanner;

public class PrintOddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		//even
		System.out.println("printing even");
		for(int i=1;i<=n;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("odd");
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();

	}

}
