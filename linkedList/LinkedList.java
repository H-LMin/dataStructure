package linkedList;

import java.util.Scanner;

import sqList.IList;

/**
 * @author Administrator 单链表描述类
 */
public class LinkedList implements IList {

	// 1、定义头结点
	public Node head;

	// 2、初始化头结点
	public LinkedList() {
		head = new Node();
	}

//	// 构造函数构造长度为n的单链表
//	public LinkedList(int n, boolean Order) {
//		this();
//		if (Order)
//			create1(n);
//		else
//			create1(n);
//	}

//	// 头插法（逆序）建立单链表
//	public void create1(int n) {
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < n; i++) {
//			insert(i, scanner.next());
//		}
//
//	}
//
//	// 尾插法（顺序）建立单链表
//	public void create2(int n) throws Exception{
//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < n; i++) {
//			insert(length(), scanner.next());
//		}
//	}

	@Override
	public void clear() {
		// 将头结点置空，后继结点置空
		head.data = null;
		head.next = null;
	}

	@Override
	public boolean isEmpty() {
		// 判断头结点是否有后继结点即可
		return head.next == null;
	}

	@Override
	public int length() {
		// 遍历单链表，返回长度
		// 定义长度
		int length = 0;
		// p 为后继结点
		Node p = head.next;
		while (p != null) {
			p = p.next;
			length++;
		}
		return length;
	}

	@Override
	public Object get(int i) {
		// 定义后继结点
		Node p = head.next;
		int j;
		// 遍历链表
		for (j = 0; j < i && p != null; j++) {
			p = p.next;
		}
		// 如果是空表或已经越过了 i
		if (j > i | p == null) {
			System.out.println("查找错误！");
		}
		return p.data;
	}

	// 带头节点的插入
	@Override
	public void insert(int i, Object x) {
		Node p = head;
		// 考虑到插入位置可能是链表头
		int j = -1;
		// 寻找i位置的前驱结点（第 i-1 个结点）
		while (p != null && j < i - 1) {
			p = p.next;
			j++;
		}
		// 判断插入位置合法性
		if (j > i - 1 | p == null) {
			System.out.println("插入位置不合法！");
		}
		// 建立要插入的新结点
		Node n = new Node();
		n.data = x;
		n.next = p.next;
		p.next = n;
	}

	@Override
	public void remove(int i) {
		Node p = head;
		int j = -1;
		// 寻找i位置的前驱结点（第 i-1 个结点）
		while (p != null && j < i - 1) {
			p = p.next;
			j++;
		}
		if(j > i - 1 | p == null) {
			System.out.println("删除位置不合法！");
		}
		p.next = p.next.next;
	}

	@Override
	public int indexOf(Object x) {
		Node p = head;
		// 定义一个游标
		int tp = 0;
		while (p != null && p.data.equals(x)) {
			p = p.next;
			tp++;
		}
		if (p != null)
			return tp;
		else
			return -1;
	}

	@Override
	public void display() {
		Node p = head;
		while (p != null && p.next !=null) {
			p = p.next;
			System.out.println(p.data);
		}
		

	}

}
