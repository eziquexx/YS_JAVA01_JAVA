package ch05.sec05;

public class test {

	public static void main(String[] args) {
		String str1 = new String("ball");
		String str2 = new String("ball");
		String str3 = "ball";

		System.out.println(str1 == str1.intern());   //false
		System.out.println(str1 == str2);   		 //false
		System.out.println(str1 == str2.intern());   //false
		System.out.println(str3 == str1.intern());   //true
		System.out.println(str3 == str2.intern());   //true
		System.out.println(str3.intern() == str1);   //false
	}

}
