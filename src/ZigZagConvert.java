public class ZigZagConvert {

	public String convert(String str, int number) {
		int length = str.length();

		StringBuffer[] sb = new StringBuffer[number];
		for (int n = 0; n < number; n++) {
			sb[n] = new StringBuffer();
		}

		int i = 0;
		while (i < length) {
			for (int id = 0; id < number && i < length; id++) {
				sb[id].append(str.charAt(i++));
			}
			for (int j = number - 2; j > 0 && i < length; j--) {
				sb[j].append(str.charAt(i++));
			}
		}
		for (int k = 1; k < number; k++) {
			sb[0].append(sb[k].toString());
		}
		return sb[0].toString();
	}

	public static void main(String[] args) {
		ZigZagConvert convert = new ZigZagConvert();
		String str = convert.convert("PAYPALISHIRING", 3);
		System.out.println(str);
	}
}