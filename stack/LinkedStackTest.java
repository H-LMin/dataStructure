package stack;

public class LinkedStackTest {

	public static void main(String[] args) {
		
		LinkedStack linkedStack = new LinkedStack();
		
		System.out.println(linkedStack.isEmpty());
		System.out.println(linkedStack.length());
		
		linkedStack.push("徐凤年");
		linkedStack.push("青鸟");
		linkedStack.push("红麝");
		linkedStack.push("姜泥");
		
		System.out.println(linkedStack.isEmpty());
		System.out.println(linkedStack.length());
		
		System.out.println(linkedStack.pop());
		System.out.println(linkedStack.peek());

	}

}
