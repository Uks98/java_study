
public class IPTV extends ColorTv {
	private String ip;
	
	public IPTV(int size, int color, String ip) {
		super(size,color);
		this.ip = ip;
	}
	
	
	void printProperty(){
		
		System.out.print(" my iptv ip : " + ip +  " size : " +  getSize() + " color : " + readColor());
	}
	
}
