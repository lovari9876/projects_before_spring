package day1107.exercise;

public class ColorTV extends TV {
	private int resolution;
	
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	
	// 당장 안쓰더라도 필드를 private으로 만들었다면
	// 반드시 만들어 줄 것!!!
	public int getResolution() {
		return resolution;
	}
	
	void printProperty() {
		System.out.printf("%d 인치 %d 컬러.", getSize(), resolution);
		// resolution, this.resolution, getResolution()
		// 3가지 방법으로 접근 가능!!!
		// 같은 클래스이기 때문이다!!!
	}
}
