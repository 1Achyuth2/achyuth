package NewAssignments;

import java.util.Scanner;
import java.util.Arrays;
public class AlphabeticalOrder {

		public static void main(String[] args) {
			Scanner c=new Scanner(System.in);
			System.out.println("Enter the a string");
			String x=c.next();
		    if(Letters(x))
		    {
		    	System.out.println("yes");
		    }
		    	else {
		    		System.out.println("no");
		    	}
		}
		static boolean Letters(String x)
		{
			
			int p=x.length();
			
		   char v[]=new char[p];
		   
		   for(int i=0;i<p;i++) 
		   {
	         v[i]=x.charAt(i);
		   }
		   
		  Arrays.sort(v);
		   for(int i=0;i<p;i++)
		   
			   if(v[i]!=x.charAt(i))
			   
				  return false;
			   
			  
				   return true;
		   

}
}
