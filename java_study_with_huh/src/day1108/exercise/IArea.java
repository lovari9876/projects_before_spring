package day1108.exercise;

interface IArea {
	double area(double a, double b);
}

class Triangle implements IArea {
	double width;
	double height;
	
	@Override	
	public double area(double a, double b) {
		width = a;
		height = b;
		double area = width * height * 0.5;
		return area;
	}
	
}

class Rectangle implements IArea {
	double width;
	double height;
	
	@Override
	public double area(double a, double b) {
		width = a;
		height = b;
		double area = width * height;
		return area;
	}
	
}