package NewAssignments;

import java.util.Scanner;

public class ReturnSecondSmallestElement {
	public static int secondSmallest (int[]a, int total) {
	int temp;  
	for (int i = 0; i < total; i++)   
	        {  
	            for (int j = i + 1; j < total; j++)   
	            {  
	                if (a[i] > a[j])   
	                {  
	                    temp = a[i];  
	                    a[i] = a[j];  
	                    a[j] = temp;  
	                }  
	            }  
	        }  
	       return a[1]; 
	} 
public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);
	//int g=s.nextInt();
	int a[]= {23,8,9,212,13,7};
	int b[]={12,8,10,56,65,74,47};  
	System.out.println("Second smallest: "+secondSmallest(a,a.length));  
	System.out.println("Second smallest: "+secondSmallest(b,b.length));
}
}
