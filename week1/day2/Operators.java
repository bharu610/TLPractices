package week1.day2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =5, b = 8;
		System.out.println("Arithmetic");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println();
		
		System.out.println("Comparison");
		//<,>,==,<=,>=,!=  --- Boolean
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a==b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println();
		
		System.out.println("Logical");
		//&& , ||
		System.out.println((a<b)&&(a!=b));
		System.out.println((a>b)&&(a!=b));
		System.out.println((a<b)||(a==b));
		
		System.out.println("Increment and Decrement"); 
		System.out.println(a++);
		System.out.println(a);
	}

}
