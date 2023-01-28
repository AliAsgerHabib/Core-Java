@SuppressWarnings("unused")
public class Trial {
	public static void main(String[] args) {
		char b = 'A';
		byte a = 12;
		short c = 125;
		int d = 2000;
		b = d;
		b = a;
		b = c;
		c = b;
		a = b;
		d = b;
	}
}
