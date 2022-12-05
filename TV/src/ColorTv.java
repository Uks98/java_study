
public class ColorTv extends Tv {
	private int color;
	
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	int readColor() {
		return this.color;
	}
	void printProperty() {
		System.out.println(getSize() + "inch" + this.color + "");
	}
}
