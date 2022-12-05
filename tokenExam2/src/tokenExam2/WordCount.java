package tokenExam2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("enter a word");
			String s = scanner.nextLine();
			
			if(s.equals("그만")) {
				System.out.println("End");
				break;
			}
			StringTokenizer st = new StringTokenizer(s," ");
			System.out.println("length is : " + st.countTokens());
		}
		scanner.close();
	}

}
