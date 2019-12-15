package org.cts.test.login;

public class AsciiValues {
public static void main(String[] args) {
	char c = 'a';
	int v = c;
	System.out.println(v);
	String s = "apple";
	for (int i = 0; i <s.length(); i++) {
		char a = s.charAt(i);
		int value = a;
		System.out.println(value);
		}
	System.out.println("AsciiValues");
	}
}
