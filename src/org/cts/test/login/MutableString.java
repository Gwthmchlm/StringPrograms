package org.cts.test.login;

public class MutableString {
public static void main(String[] args) {
	StringBuffer a = new StringBuffer("Apple");
	StringBuffer b = new StringBuffer("Orange");
	StringBuffer c = new StringBuffer("Apple");
	StringBuffer d = a.append(b);
	StringBuffer e = a.append(c);
	StringBuffer f = b.append(c);
	System.out.println("Mutable String");
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	System.out.println(System.identityHashCode(c));
	System.out.println(System.identityHashCode(d));
	System.err.println(System.identityHashCode(e));
	System.err.println(System.identityHashCode(f));
	
}
}
