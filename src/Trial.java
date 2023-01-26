
public class Trial {
	public static void main(String[] args) {
		byte n1 = 25;
		short n2 = 5;
		int n3 = Integer.MAX_VALUE;
		long n4 = 50_000L + 10L * (n1 + n2 + n3); 
		System.out.println("Answer is : " + n4);
	}
}
