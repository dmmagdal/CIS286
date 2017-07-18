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

	public BinaryTree(){
		root = null;
	}

	public BinaryTree(T rootData){
		root = new BinaryNode<>(rootData);
	}

	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		privateSetTree(rootData, leftTree, rightTree);
	}

	public void setTree(T rootData){
		root = new BinaryNode<>(rootData);
	}

	public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree){
		privateSetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
	}

	private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		root = new BinaryNode<T>(rootData);

		if ((leftTree != null) && !leftTree.isEmpty()){
			root.setLeftChild(leftTree.root);
		} 
		if ((rightTree != null) && !rightTree.isEmpty()){
			if (rightTree != leftTree){
				root.setRightChild(rightTree.root);
			}
			else{
				root.setRightChild(rightTree.root.copy());
			}
		}
		if ((leftTree != null) && (leftTree != this)){
			leftTree.clear();
		}
		if ((rightTree != null) && (rightTree != this)) {
			rightTree.clear();
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

	public T getRootData(){
		if (isEmpty()){
			throw new EmptyTreeException();
		}
		else{
			return root.getData();
		}
	}

	public int getHeight(){
		return root.getHeight();
	}

	public int getNumberOfNodes(){
		return root.getNumberOfNodes();
	}

	public boolean isEmpty(){
		return root == null;
	}

	public void clear(){
		root = null;
	}

	protected void setRootData(T rootData){
		root.setData(rootData);
	}

	protected void setRootNode(BinaryNode<T> rootNode){
		root = rootNode;
	}

	protected BinaryNode<T> getRootNode(){
		return root;
	}

	public void inOrderTraverse(){
		inOrderTraverse(root);
	}

	private void inOrderTraverse(BinaryNode<T> node){
		if (node != null){
			inOrderTraverse(node.getLeftChild());
			System.out.println(node.getData());
			inOrderTraverse(node.getRightChild());
		}
	}

	public void preOrderTraverse(){
		preOrderTraverse(root);
	}

	private void preOrderTraverse(BinaryNode<T> node){
		if (node != null){
			System.out.println(node.getData());
			preOrderTraverse(node.getLeftChild());
			preOrderTraverse(node.getRightChild());
		}
	}

	public void postOrderTraverse(){
		postOrderTraverse(root);
	}

	private void postOrderTraverse(BinaryNode<T> node){
		if (node != null){
			postOrderTraverse(node.getLeftChild());
			postOrderTraverse(node.getRightChild());
			System.out.println(node.getData());

		}
	}
}