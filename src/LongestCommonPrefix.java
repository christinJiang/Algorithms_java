public class LongestCommonPrefix {

	public String longest(String[] strs) {
		String prefix = "";
		if (strs == null || strs.length == 0) {
			return prefix;
		}

		prefix = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
			i++;
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] strs = { "chinaABC", "chiABC", "chABC" };
		LongestCommonPrefix prefix = new LongestCommonPrefix();
		String result = prefix.longest(strs);
		System.out.println(result);
	}
}
