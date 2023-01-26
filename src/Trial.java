@SuppressWarnings("unused")
public class Trial {
	public static void main(String[] args) {
		String myString = "Hello";
		String myString2 = "Hello";
		String myString3 = new String(myString);
		String myString4 = myString;
		char[] charArray = {'H','e','l','l','o'};
		String myString5 = new String(charArray);
		
		if(myString == myString2)
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		if(myString.equals(myString3))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		if(myString.contentEquals(myString5))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
	}
}
