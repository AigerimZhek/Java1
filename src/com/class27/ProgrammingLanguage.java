package com.class27;

public abstract class ProgrammingLanguage {

	public void understandLogic() {
		System.out.println("To learn programming you need to understand the logic");
	}
	public void knowSyntax() {
		System.out.println("To learn programming you need to know syntax");
	}
	
	public abstract void writeCode();
	public abstract void debug();
}


class Java extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do Java Programming you must use Eclipse, Netbeans");
	}

	@Override
	public void debug() {
		System.out.println("In Java to debug you need to use Eclipse and Netbeans");
	}	
}


class CSharp extends ProgrammingLanguage{

	@Override
	public void writeCode() {
		System.out.println("To do C# Programming you must use Visual Studio");
	}

	@Override
	public void debug() {
		System.out.println("To debug in C# you need to use Visual Studio");
	}	
}