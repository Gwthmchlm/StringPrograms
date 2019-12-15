package org.cts.test.login;

public class NonLiteralString {
public static void main(String[] args) {
	String a = new String("Apple");
	String b = new String("orange");
	String c = new String("Apple");
	System.out.println("NonLiteralString");
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
}
}
