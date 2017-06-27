
public class Reverse {

	public int reverse(int value) {
		String str = new Integer(value).toString();
		StringBuffer sb = new StringBuffer();
		if (value >= 0) {
			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
		} else {
			sb.append(str.charAt(0));
			for (int i = str.length() - 1; i > 0; i--) {
				sb.append(str.charAt(i));
			}
		}
		return Integer.parseInt(sb.toString());
	}
	
	public int reverse2(int x)
	{
	    int result = 0;
	    while (x != 0)
	    {
	        int tail = x % 10;
	        int newResult = result * 10 + tail;
	        if ((newResult - tail) / 10 != result)
	        { return 0; }
	        result = newResult;
	        x = x / 10;
	    }

	    return result;
	}

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		int number = reverse.reverse(123);
		System.out.println(number);
		int number2 = reverse.reverse2(-123);
		System.out.println(number2);
	}
}
