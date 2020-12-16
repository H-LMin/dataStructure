package stack;
/**
 * @author Administrator
 *			编程汉诺塔问题
 */
public class Hanoi {

	public static void main(String[] args) {
		hanoi(1, 'x', 'y','z');
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		hanoi(3, 'x','y', 'z');
	}
	//解决汉诺塔方法
	public static void hanoi(int n , char x , char y , char z) {
		if(n == 1)
			move(1,x,z);
		else {
			hanoi(n-1, x, z, y);
			move(n, x, z);
			hanoi(n-1, y, x, z);
		}
	}
	
	//移动的方法
	private static void move(int i, char x, char z) {
		System.out.println("将圆盘==>"+i+"从塔座"+x+"移动到塔座"+z+"    ");
		
	}

}
