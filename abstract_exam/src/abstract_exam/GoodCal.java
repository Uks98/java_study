package abstract_exam;

public class GoodCal extends Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCal c = new GoodCal();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int [] {2,3}));
	
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a -b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum =  0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];	
		}
		return sum / a.length;	
	}

}
