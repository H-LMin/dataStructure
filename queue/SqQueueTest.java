package queue;

public class SqQueueTest {

	public static void main(String[] args) {
		
		SqQueue sqQueue = new SqQueue(5);
		
		System.out.println(sqQueue.isEmpty());
		System.out.println(sqQueue.length());
		
		sqQueue.insert("徐凤年");
		sqQueue.insert("青鸟");
		sqQueue.insert("徐潇");
		sqQueue.insert("姜泥");
		
		System.out.println(sqQueue.isEmpty());
		System.out.println(sqQueue.length());
		
		sqQueue.display();
		System.out.println("      ");
		System.out.println("------------------");
		
		System.out.println(sqQueue.head());
		sqQueue.clear();
		
		System.out.println(sqQueue.isEmpty());
		System.out.println(sqQueue.length());

	}

}
