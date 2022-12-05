
public class ExCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "Java";
		String cpp = "Zibra";
		int res = java.compareTo(cpp);
		if(res == 0)
			System.out.println("the same");
		else if(res < 0)
			System.out.println(java + "<" + cpp);
		else
			System.out.println(java + ">" + cpp);
	}

}
