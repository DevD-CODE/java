public class character {
	public static void main(String[] args) {
		System.out.println(Character.isDigit('p'));
		System.out.println(Character.isDigit('0'));

		System.out.println(Character.isLetterOrDigit('A'));
		System.out.println(Character.isLetterOrDigit('0'));
		System.out.println(Character.isLetterOrDigit('*'));

		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('A'));

		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isUpperCase('A'));

		System.out.println(Character.isSpace('a'));
		System.out.println(Character.isSpace(' '));
		System.out.println(Character.isSpace('\n'));
		System.out.println(Character.isSpace('\t'));
	}
}