package string;
/**
 * @author Administrator
 *				串：每个元素就是一个字符，又叫字符串。
 */
public interface IString {
	//1、将字符串置为空串
	public void clear();
	//2、判断是否为空串
	public boolean isEmpty();
	//3、返回串的长度
	public int length();
	//4、读取并返回串中的第i个元素
	public char charAt(int i);
	//5、返回位序号从begin到end-1的子串
	public IString subString(int begin,int end);
	//6、在第i个字符前插入子串str
	public void insert(int i,IString str);
	//7、删除位序号从begin到end-1的子串
	public void delete(int begin,int end);
	//8、将子串str连接到字符串的后面
	public IString concat(IString str);
	//9、比较str和当前字符串的大小
	public int compareTo(IString str);
	//10、从位序号为begin的字符串开始搜索与str相等的子串
	public int indexOf(IString str,int begin);
}
