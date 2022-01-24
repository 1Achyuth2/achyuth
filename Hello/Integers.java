package NewAssignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Integers {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter the number");
	String a=input.nextLine();
	StringTokenizer t=new StringTokenizer(a);
	int x=0;
	int c=0;
	System.out.println("enter numbers");
	while(t.hasMoreTokens()) {
		String z=t.nextToken();
		x=Integer.parseInt(z);
		System.out.println(x+" ");
		c=c+x;
	}
	System.out.println();
	System.out.println(c);
}
}
