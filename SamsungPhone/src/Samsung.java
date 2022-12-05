interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.print("!! phone !!");
	}
}
public class Samsung implements PhoneInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung phone = new Samsung();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

	@Override
	public void sendCall() {
		System.out.println("ddiririri");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("got call");
		
	}
	
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

}
