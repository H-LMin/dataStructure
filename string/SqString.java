package string;
/**
 * @author Administrator
 *			顺序串
 */
public class SqString implements IString{
	
	//字符数组
	private char[] strValue;
	//当前串的长度
	private int curLen;
	
	
	//构造空串
	public SqString(char[] strValue, int curLen) {
		super();
		strValue = new char[0];
		curLen = 0;
	}
	
	//以字符串常量构造串
	public SqString(String str) {
		char[] p = str.toCharArray();
		strValue = p;
		curLen = p.length;
	}
	
	//以字符数组构造串
		public SqString(char[] str) {
			strValue = new char[str.length];
			for (int i = 0; i < str.length; i++) {
				strValue[i] = str[i];
			}
			curLen = str.length;
		}

		//扩容操作
		public void larger(int newCapacity) {
			char[] temp = strValue;
			strValue = new char[newCapacity];
			for (int i = 0; i < temp.length; i++) {
				strValue[i] = temp[i];
			}
		}
		
	@Override
	public void clear() {
		curLen = 0;
		
	}

	@Override
	public boolean isEmpty() {
		return curLen == 0;
	}

	@Override
	public int length() {
		return curLen;
	}

	@Override
	public char charAt(int i) {
		if (i < 0 || i>curLen) {
			System.out.println("超出范围！");
		}
		return strValue[i];
	}

	@Override
	public IString subString(int begin, int end) {
		if (begin<0 || begin>=end || end > curLen) {
			System.out.println("error!");
		}
		char[] temp = new char[end - begin];
		for (int i = begin; i < end; i++) {
			temp[i - begin] = strValue[i];
		}
		return new SqString(temp);
	}

	@Override
	public void insert(int i, IString str) {
		if(i < 0||i > curLen) {
			System.out.println("error!");
		}
		int len = str.length();
		int newCapacity = len + curLen;
		larger(newCapacity);
		for (int j = curLen - 1; j >= i; j--) {
			strValue[j + len] = strValue[j];
		}
		
		for (int j = i; j < i+len; j++) {
			strValue[j] = str.charAt(j - 1);
		}
			curLen = newCapacity;
	}

	@Override
	public void delete(int begin, int end) {
		if (begin<0 || begin>=end || end > curLen) {
			System.out.println("error!");
		}
		for (int i = begin; i < end - 1; i++) {
			strValue[i] = strValue[i+end-begin];
		}
		curLen = curLen - end + begin;
	}

	@Override
	public IString concat(IString str) {
		insert(curLen, str);
		return str;
	}

	@Override
	public int compareTo(IString str) {
		int n = Math.min(curLen, str.length());
				for (int i = 0; i < n; i++) {
					if (strValue[i] > str.charAt(i)) {
						return 1;
					}else {
						return -1;
					}
				}
		return 0;
	}

	@Override
	public int indexOf(IString str, int begin) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
