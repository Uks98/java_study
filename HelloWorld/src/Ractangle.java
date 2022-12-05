
public class Ractangle {

	private int x;
	private int y;
	private int width;
	private int height;
	
	

	Ractangle(int x, int y, int width,int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	int square() {
		return this.width * this.height;
	}
	
	void show() {
		System.out.println("사각형 좌표 x :"+ x +"사격형 좌표 y는" + this.y + "사각형 넓이는 " + this.width * this.height);
	}
	
	boolean contains(Ractangle r) {
		if(this.x < r.x && this.y >= r.y && width > r.x + r.width && y + height > r.y + r.height) {
			return true;	
		}else {
			return false;
		}
		
	}
}
