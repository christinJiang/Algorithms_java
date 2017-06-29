public class PalinDromeNumber {

	public boolean palinDromeNumber(int number) {

		String str = Integer.toString(number);
		str.trim();
		boolean equal = true;
		if (str.charAt(0) == '-' || str.charAt(0) == '+') {
			str = str.substring(1, str.length());
		}

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				equal = false;
			}
		}
		return equal;
	}

	public static void main(String[] args) {
		PalinDromeNumber number = new PalinDromeNumber();
		boolean result = number.palinDromeNumber(123212);
		System.out.println(result);
	}

}
