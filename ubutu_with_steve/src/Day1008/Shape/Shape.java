abstract class Shape {	
    private int borderColor;
    private int borderWidth;
    private int fillColor;
      
    public void draw() {
	System.out.println("Draw shape");
    }

    public abstract void move(int x, int y);

    public abstract void rotate(int radian);

    public final int getBorderColor() {
	return borderColor;
    }
    
    //final 붙이면 퍼블릭이니까 상속은 되지만 수정 불가
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
    
    public final void setFillColor(int color) {
	this.fillColor = color;
    }


}





