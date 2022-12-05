import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {


		// TODO Auto-generated method stub
		
		static void printList(LinkedList<String> I) {
			Iterator<String> iterator = I.iterator();
			while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.println(e + separator);
		}
	}
		public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		
		myList.add("트랜스 포머");
		myList.add("스타워즈");
		myList.add("메트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList);
		printList(myList);
		}
}
