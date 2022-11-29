public class TestDriver {

	public static void main(String[] args) {
		
		System.out.println("Starting Test Suite");

		int result = runTests();
		
		System.out.println("Result: " + result);
		
		System.out.println("Tests completed");
		
	}
	
	public static int runTests(){

		if(baseTest() != 1){
			System.out.println("TEST FAILED: baseTest");
			return 0;
		}

		if(intTest1() != 1){
			System.out.println("TEST FAILED: intTest1");
			return 0;
		}

		if(intTest2() != 1){
			System.out.println("TEST FAILED: intTest2");
			return 0;
		}

		if(intTest3() != 1){
			System.out.println("TEST FAILED: intTest3");
			return 0;
		}

		if(functionTest1() != 1){
			System.out.println("TEST FAILED: functionTest1");
			return 0;
		}

		if(doubleTest1() != 1){
			System.out.println("TEST FAILED: doubleTest1");
			return 0;
		}

		if(stringTest1() != 1){
			System.out.println("TEST FAILED: stringTest1");
			return 0;
		}

		return 1;
	}
	
	public static int baseTest() { 
		int a = 10;
		int b = 22;
		
		int i = 999;
		
		i = 3 iff a > b else 5; // result would be 5

		if(i != 5){
			return 0;
		}
		
		return 1;
	}

	public static int intTest1() { 
		int a = 2;
		int b = 1;
		
		int i = 999;
		
		i = 3 iff a > b else 5;

		if(i != 3){
			return 0;
		}
		
		return 1;
	}

	public static int intTest2() { 
		int a = 1;
		int b = 1;
		
		int i = 999;
		
		i = 0 iff a == b else 1;

		if(i != 0){
			return 0;
		}
		
		return 1;
	}

	public static int intTest3() { 
		int a = 10;
		int b = 100;
		
		int i = 999;
		
		i = 111 iff a <= b else 222;

		if(i != 111){
			return 0;
		}
		
		return 1;
	}

	public static boolean returnBool(boolean x){
		return x;
	}

	public static int functionTest1() { 
		int a = 10;
		int b = 100;
		
		int i = 1 iff returnBool(true) else 2;

		if(i != 1){
			return 0;
		}
		
		return 1;
	}

	public static int doubleTest1() { 
		double a = 10;
		double b = 10.4;
		
		double i = 2 iff a > b else 1;

		if(i != 1){
			return 0;
		}
		
		return 1;
	}

	public static int stringTest1() { 
		String a = "test";
		String b = "test1";
		
		String i = "true" iff a.equals(b) else "false";

		if(!i.equals("false")){
			return 0;
		}
		
		return 1;
	}

}