import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> _Sum(int[] list) {
		int length = list.length;
		if (length < 3) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i=0;i<length - 2;i++) {
			for (int j =i+1; j<length - 1;j++ ) {
				for (int k = j+1;k<length; k++) {
					if (list[i] + list[j] + list[k] == 0) {
						List<Integer> value = new ArrayList<Integer>();
						value.add(list[i]);
						value.add(list[j]);
						value.add(list[k]);
						result.add(value);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ThreeSum sum = new ThreeSum();
		int[] arr = {4,3, -1, -2,-3,1};
		List<List<Integer>> result = sum._Sum(arr);
		System.out.println(result);
	}
}
