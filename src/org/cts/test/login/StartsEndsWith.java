package org.cts.test.login;

public class StartsEndsWith {
public static void main(String[] args) {
	int a[]= new int[10];
	a[0]=10;
	a[1]=20;
	a[2]=50;
	a[3]=10;
	a[4]=60;
	
//	System.out.println(a[3]);
	
//	int x=a.length;
//	System.out.println(x);
//	System.out.println("Normal Forloop for iteration");
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
	
	 sum = sum+a[i];
		//System.out.println(sum);
	}
	System.out.println(sum);
	
	
	//Normal Forloop
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//		
//	}
//	System.out.println("Enhanced Forloop");
//	for (int i : a) {
//		System.out.println(i);
//	}
}
}
