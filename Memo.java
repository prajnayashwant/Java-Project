package stringconcatination;

public class Memo {
	public static void main(String[]args) {
		String s1 = new String("Hello");
		String s2 = s1.concat("World");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("----------------");
		String s3 = "Hello Siri";
		System.out.println(s3.length());
		System.out.println(s3.substring(7));
		System.out.println(s3.toUpperCase());
	}
}
