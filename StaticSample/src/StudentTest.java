class Student{
	String name;
	int money;
	Student(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	Student(String name){
		this.name = name;
		money = 0;
	}
	
	public void takeBus() {
		money = money-1000;
	}
	
	public void showInfo() {
		if(money < 1000) {
			System.out.println(name + "님은 버스를 탈 수 없습니다");
		}
		else {
			System.out.println(name + "님의 남은 돈은 " + money + "입니다");
		}
	}
}
public class StudentTest {
	public static void main(String[] args) {
		Student S1 = new Student("홍길동", 5000);
		Student S2 = new Student("김철수");
		
		S1.takeBus();
		S1.showInfo();
		S2.takeBus();
		S2.showInfo();
	}
}
