package sqList;

public class SqListTest {

	public static void main(String[] args) {
		//初始化一个线性表
		SqList01 list = new SqList01(9);
		
		//1、判断是否为空
		System.out.println(list.isEmpty());
		//2、插入一些元素
		list.insert(0, 9);
		list.insert(1, 6);
		list.insert(2, 24);
		list.insert(3,66 );
		list.insert(4, 28);
		list.insert(5, 12);   
		list.insert(6, 24);  		
		list.insert(4, 4);  		
		//3、再判断是否为空
		System.out.println(list.isEmpty());
		//4、显示表中的元素
		list.display();
		System.out.println("   ");
		//5、获取指定元素的首次出现位置
		System.out.println("24的首次出现位置===>"+list.indexOf(24));
		//6、获取某位置的元素
		System.out.println("4位置的元素====>"+list.get(4));
		//7、获取长度
		System.out.println(list.length());
		//8、删除第i个元素
		list.remove(3);
		list.remove(5);
		
		list.display();
		System.out.println("   ");
		

	}

}
