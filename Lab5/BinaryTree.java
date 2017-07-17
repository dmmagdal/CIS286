/** creates a tree 
@author Frank M. Carrano
@author Timothy M. Henry
Version 4.0 **/

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class BinaryTree<T> implements BinaryTreeInterface<T>{
	private BinaryNode<T> root; // the root node of the binary tree

	public BinaryTree(){
		root = null;
	}

	public BinaryTree(T rootData){
		root = new BinaryTree<>(rootData);
	}

	public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		privateSetTree(rootData, leftTree, rightTree);
	}

	public void setTree(T rootData){
		root = new BinaryNode<>(rootData);
	}

	public void setTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		privateSetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
	}

	private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree){
		root = new BinaryNode<T>(rootData);

		if (leftTree != null){
			root.setLeftChild(leftTree.root);
		}
		if (rightTree != null){
			root.setRightChild(rightTree.root);
		}
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

	public void inOrderTraverse(BinaryNode<T> node){
		if (node != null){
			inOrderTraverse(node.getLeftChild());
			System.out.println(node.getData());
			inOrderTraverse(node.getRightChild());
		}
	}
}