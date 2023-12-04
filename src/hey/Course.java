package hey;

public class Course {

	public static void main(String[] args) {
		int a=126;
		byte b=(byte)a;//explicit conversion
		
		System.out.println(b+","+a);
		b=90;
		a=b;//implicit conversion
		System.out.print(b+","+a);
		
	}

}
