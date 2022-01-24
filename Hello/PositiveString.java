package NewAssignments;

import java.util.HashMap;
import java.util.Scanner;

public class PositiveString {
	 public static void main(String[]args) {
			HashMap<Character,Integer> s = new HashMap<>();
		    s.put('A',0);
		    s.put('B',1);
		    s.put('C',2);
		    s.put('D',3);
		    s.put('E',4);
		    s.put('F',5);
		    s.put('G',6);
		    s.put('H',7);
		    s.put('I',8);
		    s.put('J',9);
		    s.put('K',10);
		    s.put('L',11);
		    s.put('M',12);
		    s.put('N',13);
		    s.put('O',14);
		    s.put('P',15);
		    s.put('R',16);
		    s.put('S',17);
		    s.put('T',18);
		    s.put('U',19);
		    s.put('V',20);
		    s.put('W',21);
		    s.put('X',22);
		    s.put('Y',23);
		    s.put('Z',24);
		 Scanner scn=new Scanner(System.in);
		    String str = scn.nextLine();
		    int a = 0 ;
		    boolean e= true;
		    for(char c : str.toCharArray()){
		        if (a>s.get(c)){
		            e= false;
		            break;
		        }
		        a=s.get(c);
		    }
		    System.out.println(e);

		}
}
