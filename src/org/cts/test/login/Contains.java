package org.cts.test.login;

public class Contains {
public static void main(String[] args) {
	String s = "Apple";
	String s1 = "Orange";
	char t= '9';
	System.out.println(t);
	boolean c = s.contains("Ap");
	System.out.println(c);
	boolean c1 = s1.contains("li");
	System.out.println(c1);
	String s2 = " I am from Erode";
	String[] sp = s2.split("o");
	for (String x : sp) {
		System.out.println(x);
	}
}
}
