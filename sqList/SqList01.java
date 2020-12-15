package sqList;
/**
 * @author Administrator
 *	线性表操作
 */
public class SqList01 implements IList{
	//声明线性表当前的长度
	private int curlen;
	//声明线性表最大的长度
	private int maxLen;
	//声明存储空间：定义
	private Object[] sqList;
	
	//首先应当构造一个线性空表
	public SqList01(int len) {
		//当前长度为0
		curlen = 0;
		//最大长度为传入的长度
		maxLen = len;
		//new一个对象数组，长度为传入长度
		sqList = new Object[maxLen];
	}


	@Override
	public void clear() {
		//将线性表长度置为0即可
		curlen = 0;
		
	}

	@Override
	public boolean isEmpty() {
		return curlen == 0;
	}

	@Override
	public int length() {
		//返回当前长度即可
		return curlen;
	}

	@Override
	public Object get(int i) {
		//先判断是否满足线性表条件：curlen > 0、获取的元素位置i不能超过线性表长度
		if (curlen < 0 | i > curlen - 1) 
			System.out.println("curlen < 0、获取的元素位置 i 超过了线性表长度!");
		return sqList[i];
		
	}

	@Override
	public void insert(int i, Object x) {
		//1、判断当前线性表是否已满
		if (curlen == maxLen) 
			System.out.println("当前线性表已满，无法再插入！");
		
		//2、判断插入的位置是否符合要求
		if (i < 0 | i > curlen) 
			System.out.println("插入的位置超出范围，无法再插入！");
		
		//3、将插入后的元素都后移一位
		for (int j = curlen ; j > i; j--) 
			//1、先后移一位，从末尾开始后移
			sqList[j] = sqList[j - 1];
		
		//2、再插入元素x
		sqList[i] = x;
		//3、表长度加一
		curlen++;
	}

	@Override
	public void remove(int i) {
		//1、判断删除的位置是否符合要求
		if (i < 0 | i > curlen) 
			System.out.println("删除的位置超出！");
		
		//2、移除，后面的元素向前进一位
		if (i < curlen) {
			for (int j = i; j < curlen; j++) 
				sqList[j] = sqList[j+1];
		}	
		curlen--;
		
	}

	@Override
	public int indexOf(Object x) {
		for (int i = 0; i <= curlen - 1; i++) {
			if (sqList[i].equals(x))
				return i;
		}
		return -1;
	}

	@Override
	public void display() {
		for (Object object : sqList) {
			System.out.print(object+"   ");
		}	
	}

}
