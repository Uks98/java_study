
class Triangle{
	private double down;
	private double height;
	
	private double s;
	Triangle(double down, double height){
		this.down = down;
		this.height = height;
	}
	
	public double findArea() {
		return down * height /2;
	}
	
	public boolean isSameArea(Triangle t) {
		if(down * height /2 == t.down * t.height /2) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class TriangleTest {
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
		System.out.println(t1.findArea());
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}
