package day1017;

public class ReverseBits {
	public int reverseBits(int n) {
		int reverse = 0;
		int temp = n;
		
		for (int i = 0; i < 32; i++) {
			int bit = temp & 0x1;
//			temp = n & 0x00000001;
			reverse = reverse << 1 | bit;
			temp >>= 1;
		}		
		return reverse;
	}
}
