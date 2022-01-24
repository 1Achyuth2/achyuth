package NewAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
public static void main(String[] args) {
	System.out.println("Enter the String: ");
	String a=new Scanner(System.in).nextLine();
	String []split = a.split("");
	
	Exercise6 exe = new Exercise6();
	String [] result = exe.sort(split);
	System.out.println("The sorted list is ");
	for(String str:result) {
		System.out.print(str);
	}
	}
String[] sort(String[] p) {
Arrays.sort(p);
int m= p.length/2;
for(int i=0;i<m;i++) {
	p[i]=p[i].toUpperCase();
}
if(p.length%2 !=0)
	p[m]=p[m+1].toUpperCase();
return p;
	
}
}
