package looping1;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		int num=1;
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(num +" ");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		//
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			for(int j=i;j>=1;j--) {
				if(i!=0) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			for(int j=i;j>=1;j--) {
				if(i!=0) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for(int i=1;i<4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=4-i;j++) {
				System.out.print(j);
			}
			for(int j=4-1-i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		for(int i=1;i<=5;i++) {
			if(i!=4 && i!=5) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
			}
			
			System.out.println();
		}
		for(int i=1;i<4;i++) {
			for(int j=1;j)
		}
		*/
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(j==1 && i%2!=0)
					System.out.print(i+" ");
				else if(j==1 && i%2==0)
					System.out.print(i+1+" ");
				else if(j==2 || j==3)
					System.out.print(i+" ");
				else if(j==4 && i%2!=0)
					System.out.print(i+1+" ");
				else if(j==4 && i%2==0)
					System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}
