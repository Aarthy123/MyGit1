package org.baseclass;

public class Ch extends BaseClass{

	public static void main(String[] args) {
		
		Ch c =new Ch();
		c.getDriverMethod("https://www.facebook.com/");
		
		
		String currentUrlMethod = c.getCurrentUrlMethod();
System.out.println(currentUrlMethod);

String titleMethod = c.getTitleMethod();
System.out.println(titleMethod);


	}
}
