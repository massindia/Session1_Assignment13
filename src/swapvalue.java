
class swapvalue {
	public static void main(String[] args) {
		int a = 50;
		int b = 40;
		System.out.println("Before swap the value ");
		System.out.println("A Value is: "+a);
		System.out.println("B Value is: "+b);
		a=a+b;
		b =a-b;
		a =a-b;
		System.out.println("After swap the value ");
		System.out.println("A Value is: "+a);
		System.out.println("B Value is: "+b);
		
	}

}
