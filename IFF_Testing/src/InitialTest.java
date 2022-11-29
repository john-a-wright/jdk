public class InitialTest {

	public static void main(String[] args) {
		
		System.out.println("Initial IFF Test");
		
		System.out.println("Should be 5: " + m(10,22));
		
		System.out.println("Test completed");
		
	}
	
	public static int m(int a, int b) { 
		// a=10, b=22
		
		int i = 999;
		
		i = 3 iff a > b else 5; // result would be 5
		
		return i;
	}

}