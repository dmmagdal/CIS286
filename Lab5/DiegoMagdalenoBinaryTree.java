/** creates a tree ADT
@author Frank M. Carrano
@author Timothy M. Henry
Version 4.0 **/

// import java.util.Iterator;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
// import java.StackAndQueuePackage.*;

public class BinaryTree<T> implements BinaryTreeInterface<T>{
	private BinaryNode<T> root; // the root node of the binary tree

	// constructor
	public BinaryTree(){
		root = null; // takes no arguments so the root is null
	}

	public BinaryTree(T rootData){
		root = new BinaryNode<>(rootData); // root is now a new binary node
	}

	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		privateSetTree(rootData, leftTree, rightTree); // define a new binary tree to the new root and sets the left and right sub trees
	}

	/** set binary tree to a new node one node binary tree
	@param 
	@return returns nothing **/
	public void setTree(T rootData){
		root = new BinaryNode<>(rootData);
	}

	/** sets binary tree to a new binary tree
	@param rootData 	the object that is the data for the new tree's root
	@param leftTree		the left subtree of the new tree
	@param rightTree	the right subtree of the new tree
	@return returns nothing **/
	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree){
		privateSetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
	}

	/** makes a new binary node and that node's left and right child
	@param rootData 	the data of the new tree and set it to the root binary node
	@param leftTree 	the left child of the binary node
	@param rightTree	the right child of the binary node
	@return returns nothing**/
	private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		root = new BinaryNode<T>(rootData);

		if ((leftTree != null) && !leftTree.isEmpty()){ // if the left subtree is not null and it's not empty, set the left child to that subtree
			root.setLeftChild(leftTree.root);
		} 
		if ((rightTree != null) && !rightTree.isEmpty()){ // if the right subtree is not null and it's not empty
			if (rightTree != leftTree){					  // and if the left right tree are different, set the right child to that subtree
				root.setRightChild(rightTree.root);
			}
			else{										  // otherwise, set the right subtree to be a copy
				root.setRightChild(rightTree.root.copy());
			}
		}
		if ((leftTree != null) && (leftTree != this)){ // if the left subtree is not null and it's not the same as it's current node
			leftTree.clear();						   // clear the left subtree
		}
		if ((rightTree != null) && (rightTree != this)){ // if the right subtree is not null and it's not the same as it's current node
			rightTree.clear();							 // clear the right subtree
		}

		/*
		// old code from file online
		if (leftTree != null){
			root.setLeftChild(leftTree.root);
		}
		if (rightTree != null){
			root.setRightChild(rightTree.root);
		}
		*/

	}

	/** retrieve the root node's data
	@param takes no arguments
	@return returns the node's data **/
	public T getRootData(){
		if (isEmpty()){ // throw the EmptyTreeException if the tree is empty
			throw new EmptyTreeException();
		}
		else{ // otherwise return the root's data
			return root.getData(); 
		}
	}

	/** retrieve the height of the tree
	@param takes no arguments
	@return returns the height of the root node **/
	public int getHeight(){
		return root.getHeight();
	}

	/** retrieve the number of nodes in the tree
	@param takes no arguments
	@return returns the number of nodes in the tree **/
	public int getNumberOfNodes(){
		return root.getNumberOfNodes(); // call the same method from the root node (uses method from binary node class)
	}

	/** tells if the tree is empty
	@param takes no arguments
	@return returns true if the tree is empty and false if it's not**/
	public boolean isEmpty(){
		return root == null; // if the root is null, the tree is empty
	}

	/** clears the tree
	@param takes no arguments 
	@return returns nothing **/
	public void clear(){
		root = null; // clears tree by setting root node to null
	}

	/** set the data in the root node
	@param takes the new data that's going to be put in the root
	@return returns nothing **/
	protected void setRootData(T rootData){
		root.setData(rootData);
	}

	/** set the node in the root node
	@param takes the new node that's going to replace the root node 
	@return returns nothing **/
	protected void setRootNode(BinaryNode<T> rootNode){
		root = rootNode;
	}

	/** retrieve the root node
	@param takes no arguments 
	@returns returns the root node of the tree **/
	protected BinaryNode<T> getRootNode(){
		return root;
	}

	/** prints the tree in an inorder traversal
	@param takes no arguments 
	@return returns nothing **/
	public void inOrderTraverse(){
		inOrderTraverse(root);
	}

	/** performs a recusive inorder traversal of the tree starting at the node listed in the argument
	@param takes the node to start the traversal 
	@return returns nothing**/
	private void inOrderTraverse(BinaryNode<T> node){
		if (node != null){
			inOrderTraverse(node.getLeftChild());
			System.out.print(node.getData()+" ");
			inOrderTraverse(node.getRightChild());
		}
	}

	/** prints the tree in an preorder traversal
	@param takes no arguments 
	@return returns nothing **/
	public void preOrderTraverse(){
		preOrderTraverse(root);
	}

	/** performs a recusive preorder traversal of the tree starting at the node listed in the argument
	@param takes the node to start the traversal 
	@return returns nothing**/
	private void preOrderTraverse(BinaryNode<T> node){
		if (node != null){
			System.out.print(node.getData()+" ");
			preOrderTraverse(node.getLeftChild());
			preOrderTraverse(node.getRightChild());
		}
	}

	/** prints the tree in an postorder traversal
	@param takes no arguments 
	@return returns nothing **/
	public void postOrderTraverse(){
		postOrderTraverse(root);
	}

	/** performs a recusive postorder traversal of the tree starting at the node listed in the argument
	@param takes the node to start the traversal 
	@return returns nothing**/
	private void postOrderTraverse(BinaryNode<T> node){
		if (node != null){
			postOrderTraverse(node.getLeftChild());
			postOrderTraverse(node.getRightChild());
			System.out.print(node.getData()+" ");

		}
	}
}