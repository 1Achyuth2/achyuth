package NewAssignments;

import java.util.Scanner;

public class SumOfSquares {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int a=s.nextInt();
	A y=new A();
	System.out.println(y.calculateDifference(a));
}
}
class A{
	int j=1;
	int g=1;
	  int calculateDifference(int a) {
		for(int i=2;i<=a;i++) {
			int b;
			b=i*i;
			j+=b;
		}
		for(int i=2;i<=a;i++) {
			g+=i;
		}
		int sum=j-g;
		return sum;
	}
}