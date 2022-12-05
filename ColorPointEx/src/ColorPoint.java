
public class ColorPoint extends Point{

	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColor() {
		System.out.print(color);
		showPoit();
	}
}
