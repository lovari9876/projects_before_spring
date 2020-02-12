package day1108.exercise3;

public class MinMax implements IMinMax {

	public double min(double arr[]) {
		double min = arr[0];
		for(double e : arr)
			if(min > e)
				min = e;
		return min;
	}

	public double max(double arr[]) {
		double max = arr[0];
		for(double e : arr)
			if(max < e)
				max = e;
		return max;
	}
}
