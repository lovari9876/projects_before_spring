package day1107.exercise;

public class IPTV extends ColorTV {
	private String ip;
	
	public IPTV(String ip, int size, int resolution) {		
		super(size, resolution);
		this.ip = ip;
	}
	
	public String getIp() {
		return ip;
	}
	
	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 ", ip);
		super.printProperty();
	} // 결과: 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	// 같은 거니까 이어붙이기 신공!!
}
