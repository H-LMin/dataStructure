package queue;

public class CircleQueueTest {

	public static void main(String[] args) {
		
		CircleQueue sqQueue = new CircleQueue(5);
		
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
		
		System.out.println(5/2);

	}

}
