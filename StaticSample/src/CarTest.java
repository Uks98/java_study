class Car{
	private String color;
	static int colornum = 0;
	static int num = 0;
	
	Car(String color)
	{
		this.color = color;
		num++;
		if(color == "yellow" || color == "YELLOW") {
			colornum++;
		}
	}
			
	public static int getNumOfCar(){
		return num;
	}
	
	public static int getNumOfYellowCar() {
		return colornum;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("yellow");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		Car c4 = new Car("YELLOW");
		
		System.out.print("자동차 수 : "+ Car.getNumOfCar() + ", 노란색 자동차 수 : " +  Car.getNumOfYellowCar());
	}
}
