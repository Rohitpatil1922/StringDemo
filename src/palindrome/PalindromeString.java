package palindrome;

public class PalindromeString {

	static boolean ispalindrome(String s) {

		int i = 0, j = s.length() - 1;

		while (i < j) {

			if (s.charAt(i) != s.charAt(j))

				return false;

			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "dad";

		s = s.toLowerCase();

		if (ispalindrome(s))

			System.out.print("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}
}
