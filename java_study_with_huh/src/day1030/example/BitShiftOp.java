package day1030.example;

public class BitShiftOp {

	public static void main(String[] args) {
		byte num;

		// 왼쪽으로 숫자만큼 비트 단위로 민다.
		num = 2;
		System.out.println((byte) (num << 1) + " ");
		System.out.println((byte) (num << 2) + " ");
		System.out.println((byte) (num << 3) + " ");

		// 오른쪽으로 숫자만큼 비트 단위로 민다.
		num = 8;
		System.out.println((byte) (num >> 1) + " ");
		System.out.println((byte) (num >> 2) + " ");
		System.out.println((byte) (num >> 3) + " ");

		// 부호 부분은 그대로 기입하고, 나머지만 0으로 채운다.
		num = -8;
		System.out.println((byte) (num >> 1) + " ");
		System.out.println((byte) (num >> 2) + " ");
		System.out.println((byte) (num >> 3) + " ");

		num = -8;
		System.out.println((byte) (num >>> 3) + " ");
		// >>> 연산자는 부호 신경안쓰고 0으로 채운다.

	}

}
