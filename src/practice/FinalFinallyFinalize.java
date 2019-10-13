package practice;

public class FinalFinallyFinalize {

	public static void main(String[] args) {

		final int a = 9;
		                //non-access modifier
	           	        //used to define constant values, value cannot be changed(variable)
		                // to prevent inheritance(class)
		                // to prevent method overriding (method)
		
	}

	
	public void test() {
		try {
			System.out.println("inside try test method block");
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("inside catch block");
		}finally {
			System.out.println("inside finally block");
		}
		
		//finally - is a block that is used with association with try/catch blocks. 
		//Guarantees that no matter what exception you will get or not the code inside finally block will be executed after try/catch blocks
		
	}
	
	
	//finalize - related to garbage collector. used to perform the cleanup of memory
}
