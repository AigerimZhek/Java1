package com.class19;

public class MainClass {
	
	int a;
	static int b;
	public static void main(String[] args)
	  {
	      X x = new X();
	      MainClass obj = new MainClass();
	      
	      
	      obj.b=10;
	      System.out.println(obj.b);
	      obj.b=11;
	      System.out.println(obj.b);
	      
	      
	      obj.a=45;
	      System.out.println(obj.a);
	      obj.a=77;    
	      System.out.println(obj.a);
	      

	      System.out.println(x.i);
	      x.methodOfX();
	  }

}
