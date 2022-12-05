class Circle{
	int a;
	
	Circle(int a){
		this.a = a;
	}
	
	public void show() {
		System.out.println("반지름이" +a + "인 원이다");
	}
}

class ColoredCircle extends Circle{
	String color;
	
	ColoredCircle(int a, String color){
		super(a);
		this.color = color;
	}
	
	public void show() {
		System.out.println("반지름이"+ a +"인" + color +" 원이다");
	}
}
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		ColoredCircle c2 = new ColoredCircle(10, "빨간색");
		
		c1.show();
		c2.show();
	}
}
