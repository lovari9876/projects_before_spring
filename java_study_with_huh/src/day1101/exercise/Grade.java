package day1101.exercise;

class Grade {
	int math, science, english;
	final double three = 3.0;
		
	Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		return (math + science + english) / three;		
	}
}
