package NewAssignments;

import java.util.Scanner;

public class IncreasingNumber{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		IncreasingNumber d=new IncreasingNumber();
		System.out.println("Enter the numbers");
		if(d.checkNumber(scn.nextInt()))
		{
			System.out.println("increasing number");
		}
		else
		{
			System.out.println("not increasing number");
		}
		
	}
		boolean checkNumber(int n) {
		    String check = String.valueOf(n); 
		    int length = check.length();
		    for (int i = 0; i < length-1; i++) {
		        if(check.charAt(i) <= check.charAt(i+1)) {
		            continue;
		        }
		        else return false; 
		    }
		    return true; 
		}
}
