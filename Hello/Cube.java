package NewAssignments;

import java.util.Scanner;

public class Cube {
	public static void main (String[]args) {
		 Scanner S=new Scanner(System.in);
		 System.out.println("Input :");
		 int n=S.nextInt();
		 int s=0;
		 while(n>0) {
			 int mod =n%10;
			 s= s +(int)Math.pow(mod,  3);
			 n= n/10;
		 }
		 System.out.println("Sum of cubes ="  +s);
	}
}
