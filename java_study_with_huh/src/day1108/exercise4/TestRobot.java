package day1108.exercise4;

// action() 메소드 구현하기!

public class TestRobot {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}		
	}
	
	static void action(Robot robot) {
		if(robot instanceof DanceRobot)
			((DanceRobot) robot).dance();
		else if(robot instanceof SingRobot)
			((SingRobot)robot).sing();
		else if(robot instanceof DrawRobot)
			((DrawRobot)robot).draw();
	}
}
