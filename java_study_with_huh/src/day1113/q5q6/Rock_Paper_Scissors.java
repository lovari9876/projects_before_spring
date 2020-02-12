package day1113.q5q6;

class Rock_Paper_Scissors implements Comparable<Object> {
	private int RPS; // 유저	
	
	public Rock_Paper_Scissors(int RPS) {
		this.RPS = RPS;		
	}
	
	@Override
	public int compareTo(Object o) {
		int result = 0;
		Rock_Paper_Scissors c = (Rock_Paper_Scissors)o; // 컴터
		if((this.RPS - c.RPS) == -1) {
			result = -1;
		} else if((this.RPS - c.RPS) == 2) {
			result = -1;
		} else if((this.RPS - c.RPS) == 0) {
			result = 0;
		} else if((this.RPS - c.RPS) == 1) {
			result = 1;
		} else if((this.RPS - c.RPS) == -2) {
			result = 1;
		}
		return result;		
	}
	
	void rockPaperScissors(Rock_Paper_Scissors c) {		
		Rock_Paper_Scissors u = new Rock_Paper_Scissors(RPS);
		
		if(u.compareTo(c) == 1) {
			System.out.println(">> 니가 이겼다.");
			return;
		} else if(u.compareTo(c) == -1) {
			System.out.println(">> 니가 졌다.");
			return;
		} else if(u.compareTo(c) == 0) {
			System.out.println(">> 무승부! 좋은 승부였다...");
			return;		
		}		
	}

	
}
