package day1017;

public class ReverseInteger {
	public int reverse(int x) {
		long sign = 1;
		long temp = x;
		
		if (temp < 0) {
			temp *= -1;
			sign = -1;
		}
		
		long reverse = 0;
		while (temp > 0) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		//if [x] overflows Integer.MAX_VALUE.....
		return (reverse > Integer.MAX_VALUE ? 0 : (int) (sign * reverse));
//		
//		if (reverse > Integer.MAX_VALUE) {
//			reverse = 0;
//		}
//		
//		return new Long(sign * reverse).intValue();        
	}
}
