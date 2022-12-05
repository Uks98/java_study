
public class Main {

	public static void main(String[] args) {
	ColorTv colort = new ColorTv(32,1024);
	IPTV iptv = new IPTV(32,1024,"192.2.01.1");
	colort.printProperty();
	iptv.printProperty();
	}

}
