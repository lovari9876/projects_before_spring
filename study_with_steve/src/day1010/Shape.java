package day1010;

abstract class Shape {	
	//멤버 변수 (또는 속성)
    private int borderColor;
    private int borderWidth;
    private int fillColor;
    
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

    public final int getFillColor() {
    	return fillColor;
    }
    
    public final void setFillColor(int fillColor) {
//    	this.fillColor = color;
		this.fillColor = fillColor;
		//멤버변수일까??
    }


}