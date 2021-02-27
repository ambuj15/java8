package someBasicPracticeOfLambda;

public class LengthOfString {

	public static void main(String[] args) {
		String value = "Ambuj";

		StringLength sL = s -> s.length();
		System.out.println("The length of the string " + value + sL.getLength(value));

	}

	interface StringLength {
		int getLength(String s);
	}
}
