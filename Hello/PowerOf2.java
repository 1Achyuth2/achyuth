package NewAssignments;

import java.util.Scanner;

public class PowerOf2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	PowerOf2 p=new PowerOf2();
	if(p.checkNumber(n)){
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}
}
boolean checkNumber(int n) {
	while(n>1) {
		if(n%2==0) {
		   n/=2;
		}
		else {
			return false;
		}
	}
	return true;
}
}