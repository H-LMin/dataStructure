package tree;
/**
 * @author Administrator
 *				二叉树链式存储结点类描述
 */
public class BiTreeNode {
	//存放结点的数据值
	public Object data;
	//存放结点的左右孩子地址
	public BiTreeNode lchild,rchild;
	
	//无参构造
	public BiTreeNode() {
		this(null,null,null);
	}

	//含参构造
	public BiTreeNode(Object data) {
		this(data,null,null);
	}

	//含参构造
	public BiTreeNode(Object data, BiTreeNode lchild, BiTreeNode rchild) {
		this.data = data;
		this.lchild = lchild;
		this.rchild = rchild;
	}
	
	
	
	
}
