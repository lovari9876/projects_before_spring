package day1010;

class Line extends Shape implements Printing {

	//overriding (부모의 메소드를 재정의)
    public void draw() {
    	super.draw();
    	//이름이 겹치는데(재정의 등이 되었을경우) 부모것 부르고 싶을 때
    	System.out.println("Draw line");
    }
    
    public void move(int x, int y) {
    	System.out.println("move line");
    }
    
    public void rotate(int radian) {
    	System.out.println("rotate line");
    }
    
    //implements a Printing interface
    public void print() {
    	System.out.println("Print something");
    }
}