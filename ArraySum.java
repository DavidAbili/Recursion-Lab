
public class ArraySum {

	public int sumOfArrays(Integer[] a,int index) {
		int sum =0;
		if (index < 0 || index == 0) {
				return 0;
				
		}
		sum += (sumOfArrays(a, index - 1) + a[index - 1]);
		return sum;
	}
}

