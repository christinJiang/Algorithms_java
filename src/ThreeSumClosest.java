import java.util.ArrayList;
import java.util.List;

public class ThreeSumClosest {

	public List<Integer> threeSumClosed(List<Integer> list, int total) {
		int length = list.size();
		if (length < 3) {
			return new ArrayList<Integer>();
		}
		int sum = 0;
		int abs = Integer.MAX_VALUE;
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) {
					sum = list.get(i) + list.get(j) + list.get(k);
					if (Math.abs(sum) < abs) {
						abs = sum;
						System.out.println(Math.abs(sum));
						result.clear();
						result.add(list.get(i));
						result.add(list.get(j));
						result.add(list.get(k));
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> testArray = new ArrayList(){{add(2); add(3); add(5); add(4); add(-3); add(-2); add(1);}};
		ThreeSumClosest sum = new ThreeSumClosest();
		List<Integer> result = sum.threeSumClosed(testArray, 0);
		System.out.println(result);
	}

}
