import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TokenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> p = new ArrayList();

		for(int i = 0; i < 5; i ++) {
			int x = (int)(Math.random() * 45 + 1);
			p.add(x);
		}
		p.sort(Comparator.naturalOrder());
		System.out.println(p);
	}

}
