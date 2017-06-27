public class MyAtoI {

	public int myAtoI(String str) {
		int length = str.length();
		int index = 0;
		int sign = 1;
		int total = 0;

		while (index < length) {
			if (str.charAt(index) == ' ') {
				index++;
			} else {
				break;
			}
		}
		if (str.charAt(index) == '-') {
			sign = -1;
			index++;
		} else if (str.charAt(index) == '+') {
			index++;
		}

		while (index < length) {
			int value = str.charAt(index) - '0';
			if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < value)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

			total = total * 10 + value;
			index++;
		}

		total = total * sign;
		return total;
	}

	public static void main(String[] args) {
		MyAtoI obj = new MyAtoI();
		int value = obj.myAtoI("a");
		System.out.println(value);
	}

}
