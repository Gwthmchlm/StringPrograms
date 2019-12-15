package org.cts.test.login;

public class EqualsIgnoreCasePrgm {
public static void main(String[] args) {
	String s = "Kesavan";
	String s1 = "Aravinthan";
	String s2 = "kesavan";
	String s3 = "aravinthan";
	boolean e = s.equalsIgnoreCase(s1);
	System.out.println(e);
	boolean e1 = s.equalsIgnoreCase(s2);
	System.out.println(e1);
	boolean e2 = s1.equalsIgnoreCase(s3);
	System.out.println(e2);
	
}
}
