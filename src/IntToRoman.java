
public class IntToRoman {
	public String intToRoman(int num) {
		if (num > 3999 || num < 1) {
			return "";
		}
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
	}

	public static void main(String[] args) {
		IntToRoman roman = new IntToRoman();
		String result = roman.intToRoman(3889);
		System.out.println(result);
	}
}
