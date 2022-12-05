package app;
import lib.Calculator;

public class GoodCalc extends Calculator{

	public
	int add( int a, int b) {
	return (a+b);
	}
	public
	int subtract( int a, int b) {
	return (a -b);
	}
	public double average(int [] a) {
	double sum = 0;
	for (int i = 0; i < a.length ; i ++)
	sum += a[i];
	return sum/a.length;}

	public static void main(String[] args) {
		Calculator calculator = new GoodCalc();
		
		System.out.println(calculator.add(10, 10));
		System.out.println(calculator.subtract(10, 3));
		System.out.println(calculator.average(new int [] {1,2,3,4,5}));

	} 
	
}
