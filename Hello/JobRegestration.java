package NewAssignments;

import java.util.Scanner;

public class JobRegestration {
	String name;
	 int password;
   static boolean Verifying(String name,int password)
	{
		if(name.length()>=12 && name.endsWith("_job"))
		{
			return true;
		}
			else
			{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		JobRegestration j1=new JobRegestration();
		System.out.println("Enter name and password");
		if(Verifying(j1.name=scn.next(),j1.password=scn.nextInt()))
		
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
