package NewAssignments;

public class ReverseNumbersInArray {
	public static void main(String[]args) {
		int[] a = new int [] {3,7,1,2,9,10};
		System.out.println("String array");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+ " ");
		}
		System.out.println("String in reverse order");
		for(int i=a.length - 1; i>=0; i--) {
		System.out.println(a[i]+ " ");
	}
	}
}
