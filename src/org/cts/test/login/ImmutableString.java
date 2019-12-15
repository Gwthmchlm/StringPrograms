package org.cts.test.login;

public class ImmutableString {
public static void main(String[] args) {
	String s = "Gowtham";
	String s1 = "Gowtham";
	String s2 = "Myvizhi";
	System.out.println("Immutable string");
	String s3 = s.concat(s1);
	String s4 = s.concat(s2);
	System.out.println(System.identityHashCode(s));
	System.err.println(System.identityHashCode(s1));
	System.err.println(System.identityHashCode(s2));
	System.err.println(System.identityHashCode(s3));
	System.err.println(System.identityHashCode(s4));
}
}
