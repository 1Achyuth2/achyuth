package NewAssignments;

import java.util.Scanner;

public class DivisibleBy3And5 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	B b=new B();
	System.out.println(b.calculateSum(n));
}
}
class B{
	int calculateSum(int n) {
		int b=0;
		int a=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				b+=i;
		    }
			else if (i%5==0) {
			a+=i;
			}
		}
		return b;
	}
}