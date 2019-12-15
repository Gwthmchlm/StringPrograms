package org.cts.test.login;

public class LiteralNonLiteralString {
public static void main(String[] args) {
	
 {
	String a = "Apple";
	String b = "Orange";
	String c = "Apple";
	System.out.println("Literal string");
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
	System.out.println("IMMUTABLE STRING");
	String d = a.concat(b);
	String e = a.concat(c);
	String f = c.concat(a);
	System.out.println(d);
	System.out.println(e);	
	System.out.println(f);
	System.out.println(System.identityHashCode(d));
	System.out.println(System.identityHashCode(e));
	System.out.println(System.identityHashCode(f));
}
}
}