package com.class27;

public class ProgLangTest {

	public static void main(String[] args) {
		ProgrammingLanguage obj1 = new Java();
		obj1.understandLogic();
		obj1.knowSyntax();
		obj1.debug();
		obj1.writeCode();

		System.out.println("--------------------------------------------------");
		
		ProgrammingLanguage obj2 = new CSharp();
		obj2.understandLogic();
		obj2.knowSyntax();
		obj2.debug();
		obj2.writeCode();
	}

}
