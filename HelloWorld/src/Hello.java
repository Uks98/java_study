
public class Hello{
	public static void main(String[]args){
		Ractangle rac = new Ractangle(2,3,10,10);
		Ractangle r2 =  new Ractangle(1,1,5,5);
		rac.show();
		System.out.print("width * height = " + rac.square());
		
		if(rac.contains(rac)) System.out.println("t는 r을 포함합니다.");
		if(rac.contains(r2)) System.out.println("t는 s을 포함합니다.");
	 }
}
 
