package day1030.exercise;

public class MainOfGrade {
	public static void main(String[] args) {
		Grade g = new Grade();
		g.setOperands(60, 70, 100);
		System.out.println("총점은 " + g.sum());
		System.out.printf("평균은 %.2f\n", g.avg());
		System.out.println("평점은 " + g.grade());
	}
}
