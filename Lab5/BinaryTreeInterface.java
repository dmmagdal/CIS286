/** interface for a binary tree
@auther Frank M. Carrano
@auther Timothy M. Henry
Version 4.0 **/

public interface BinaryTreeInterface<T> extends TreeInterface<T>{
	/** set binary tree to a new node one node binary tree
	@param 
	@return returns nothing **/
	public void setTree(T rootData);

	/** sets binary tree to a new binary tree
	@param rootData 	the object that is the data for the new tree's root
	@param leftTree		the left subtree of the new tree
	@param rightTree	the right subtree of the new tree
	@return returns nothing **/
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);
}