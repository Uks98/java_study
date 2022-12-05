package dict_ex;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDiceEx {
	public static void main(String args[]) {
		HashMap<String,String> dic = new HashMap<String,String>();
		
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple","사과");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = scanner.next();
			
			if(eng.equals("exit")) {
				System.out.println("end");
				break;
			}
		String kor = dic.get(eng);
		if(kor == null) {
			System.out.println(eng + "is not word");
		}else {
			System.out.println(kor);
		}
		}
		scanner.close();
	}
}
