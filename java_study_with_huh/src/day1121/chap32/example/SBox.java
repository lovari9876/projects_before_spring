package day1121.chap32.example;

// SBox for ObjectInputStreamEx

class SBox implements java.io.Serializable {
	String s;
	
	public SBox(String s) {
		this.s = s;
	}
	
	public String get() {
		return s;
	}
}
