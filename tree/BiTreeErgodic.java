package tree;

/**
 * @author Administrator 二叉树递归遍历的方法实现
 */
public class BiTreeErgodic {
	
	// 1、先序遍历
	public void preOrder(BiTreeNode root) {
		// 遍历当前层次的“根结点”
		System.out.println(root.data);
		// 访问左子树
		preOrder(root.lchild);
		// 访问右子树
		preOrder(root.rchild);
	}

	// 2、中序遍历
	public void inOrder(BiTreeNode root) {
		// 访问左子树
		preOrder(root.lchild);
		// 遍历当前层次的“根结点”
		System.out.println(root.data);
		// 访问右子树
		preOrder(root.rchild);
	}

	// 3、后序遍历
	public void postOrder(BiTreeNode root) {
		// 访问左子树
		preOrder(root.lchild);
		// 访问右子树
		preOrder(root.rchild);
		// 遍历当前层次的“根结点”
		System.out.println(root.data);
	}
	
	
}
