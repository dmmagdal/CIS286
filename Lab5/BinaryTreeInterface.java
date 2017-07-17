/** interface for a binary tree
@auther
@auther
Version 4.0 **/

public interface BinaryTreeInterface<T> extends TreeInterface<T>{
	public void setTree(T rootData);

	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);
}