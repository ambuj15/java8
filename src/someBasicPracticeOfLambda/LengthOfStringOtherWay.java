package someBasicPracticeOfLambda;

public class LengthOfStringOtherWay {

	public static void main(String[] args) {
		printLambda(s -> s.length());

	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLengthOfString("Ambuj"));
	}

	interface StringLengthLambda {
		public int getLengthOfString(String s);
	}

}
