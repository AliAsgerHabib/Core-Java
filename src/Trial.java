@SuppressWarnings("unused")
public class Trial {
	public static void main(String[] args) 
	{
		double num1 = 20.0;
		double num2 = 80.0;
		boolean isRemainderZero = (num1 + num2) * 100 % 40 == 0;
		System.out.println(isRemainderZero);
		if(!isRemainderZero)
			System.out.println("Got some Remainder");
	}
}
