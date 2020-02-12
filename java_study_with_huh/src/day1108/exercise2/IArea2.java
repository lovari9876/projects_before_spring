package day1108.exercise2;

interface IArea2 {
	double area();
}

class Triangle implements IArea2 {
	double width;
	double height;

	Triangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public double area() {
		return width * height * 0.5;
	}
}

class Rectangle implements IArea2 {
	double width;
	double height;

	Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	@Override
	public double area() {
		return width * height;
	}
}
