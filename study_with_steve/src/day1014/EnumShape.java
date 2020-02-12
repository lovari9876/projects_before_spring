package day1014;
//열거형
enum Gender {
	FEMALE("Female"),
	MALE("Male");
	
	private String value;
	private Gender(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
};

enum Color {
	RED(0xff0000),
	GREEN(0x00ff00),
	BLUE(0x0000ff);
	
	private int value;
	
	//생성자인데 private이라서 new할수없어!!
	//new할라면 public으로 해야혀
	private Color(int value) {
		this.value = value;
	//this 꼭 써줘야해!!! 
	//왜냐면 변수 value랑 괄호안의 로컬 value랑 이름이 같으니깐!!
	}
	
	//Color와 정수값을 연결해줘!!
	public int value() {
		return this.value;
		//this 꼭 안써도 돼
	}
};

abstract class EnumShape {	
	//클래스(정적) 멤버 상수
	public static final int RED = 0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;
	    
	//멤버 변수 (또는 속성)
    private int borderColor;
    private int borderWidth;
    private Color fillColor;
    
    public EnumShape() {
    	this.fillColor = Color.RED;
    	//enum갖고오기!!!
    	//new 할수없고 이런식으로 갖고온다!!
    	
    	int value = Color.RED.value();
    	//정수값 갖고올때
    }
    public static void test() {
    // static이 붙은 클래스함수 안에서는 'this.객체'를 사용할 수 없다.
    }
    
    public void draw() {
    	System.out.println("Draw shape");
    }

    public abstract void move(int x, int y);

    public abstract void rotate(int radian);

    public final int getBorderColor() {
    	return borderColor;
    }
    
    public final void setBorderColor(int color) {
    	this.borderColor = color;
    }

    public final int getBorderWidth() {
    	return borderWidth;
    }
    
    public final void setBorderWidth(int width) {
    	this.borderWidth = width;
    }

    public final Color getFillColor() {
    	return fillColor;
    }
    
    public final void setFillColor(Color fillColor) {
//    	this.fillColor = color;
		this.fillColor = fillColor;
		//멤버변수일까??
    }
}