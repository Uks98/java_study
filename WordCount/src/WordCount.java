import java.util.Scanner;
import java.util.*;

public class WordCount {

	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println(">>");
		String x = scanner.nextLine();

		if(x.equals("그만")) {
			System.out.println("종료합니다");
			break;
		}
		StringTokenizer st = new StringTokenizer(x);
		System.out.println("어절개수는" + st);
	}
	scanner.close();
	
}

}
