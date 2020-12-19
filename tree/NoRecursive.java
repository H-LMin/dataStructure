package tree;

import stack.LinkedStack;

/**
 * @author Administrator
 *			非递归、利用栈实现二叉树的遍历
 */
public class NoRecursive {
	private BiTreeNode root;

	//1、先序遍历
	public void pre() {
		BiTreeNode p = root;
		if (p != null) {
			LinkedStack stack = new LinkedStack();
			stack.push(p);
			while (! stack.isEmpty()) {
				p = (BiTreeNode) stack.pop();
				System.out.print(p.data+"==>");
				while (p != null) {
					if (p.lchild != null) {
						System.out.print(p.lchild.data+"==>");
					}
					if (p.rchild != null) {
						stack.push(p.rchild);
					}
					p = p.lchild;
				}
			}
			}
		}
		
		//2、中序遍历
		public void in() {
			BiTreeNode p = root;
			if (p != null) {
				LinkedStack stack = new LinkedStack();
				stack.push(p);
				while (! stack.isEmpty()) {
					while (p.lchild != null) {
						p = p.lchild;
						stack.push(p);
					}
					p = (BiTreeNode) stack.pop();
					System.out.print(p.data+"==>");
					if (p.rchild != null) {
						stack.push(p.rchild);
					}
				}
			}
		
	}

		
		//3、后序遍历
		public void post() {
			BiTreeNode p = root;
			boolean flag = true;
			BiTreeNode t = null;
			if (p != null) {
				LinkedStack stack = new LinkedStack();
				stack.push(p);
				while (! stack.isEmpty()) {
					p = (BiTreeNode) stack.peek();
					while (p.lchild != null) {
						p = p.lchild;
						stack.push(p);
					}
					while (flag && ! stack.isEmpty()) {
						if (p.rchild == t || p.rchild == null) {
							System.out.println(p.data+"==>");
							flag = true;
							t = p;
							stack.pop();
						}
						else {
							stack.push(p.rchild);
							flag = false;
						}
					}
				}
			}
		}
	
	
	
	
	
}




