import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
	
		Scanner scanner = new Scanner(System.in);
		
		for(int i =0; i < 4; i ++) {
			System.out.println("enter the name!");
			
			String s = scanner.next();
			
			a.add(s);
		}
		
		for(int i = 0; i < a.size(); i ++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
		
		int longest = 0;
		
		for(int i = 1; i < a.size(); i ++) {
			if(a.get(longest).length() < a.get(i).length())
			longest = i;
		}
		System.out.println("long name is" + a.get(longest));
	}
	

}
