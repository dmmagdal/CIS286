/** creates nodes for a binary tree as well as create methods to view and manipulate nodes. 
Much of the code is sourced from the book.
@author Frank M. Carrano
@author Timothy M. Henry
Version 4.0 **/

public final class BinaryNode<T>{
	private T data;					// stores the data in a BinaryNode
	private BinaryNode<T> leftChild;	// reference to the left child
	private BinaryNode<T> rightChild;	// reference to the right child

	// constructor for BinaryNode
	public BinaryNode(){
		this(null); // uses preceeding constructor and fills in for the argument
	}

	public BinaryNode(T entry){
		this(entry, null, null);
	}

	public BinaryNode(T entry, BinaryNode<T> left, BinaryNode<T> right){
		data = entry;
		leftChild = left;
		rightChild = right;
	}

	/** returns the data stored in the node
	@param takes no arguments
	@return data **/
	public T getData(){
		return data;
	}

	/** sets the node's data
	@param takes the argument of new data for type T
	@return returns nothing **/
	public void setData(T newEntry){
		data = newEntry;
	}

	/** returns the reference to the left child
	@param takes no arguments
	@return a reference to the left child **/
	public BinaryNode<T> getLeftChild(){
		return leftChild;
	}

	/** sets the reference to the left child
	@param takes the argument of a binarynode
	@return returns nothing **/
	public void setLeftChild(BinaryNode<T> newLeft){
		leftChild = newLeft;
	}

	/** returns the reference to the right child
	@param takes no arguments
	@return a reference to the right child **/
	public BinaryNode<T> getRightChild(){
		return rightChild;
	}

	/** sets the reference to the right child
	@param takes the argument of a binarynode 
	@return returns nothing **/
	public void setRightChild(BinaryNode<T> newRight){
		rightChild = newRight;
	}

	/** says whether a left child is set
	@param takes no arguments
	@return returns true if there is a reference to a left child and false if that reference is null **/
	public boolean hasLeft(){
		return getLeftChild() != null;
	}

	/** says whether a right child is set
	@param takes no arguments
	@return returns true if there is a reference to a right child and false if that reference is null **/
	public boolean hasRight(){
		return getRightChild() != null;
	}

	/** tells whether a node is a leaf
	@param takes no arguments
	@return returns true if the left and right childs are null and false if they're not **/
	public boolean isLeaf(){
		return (leftChild == null) && (rightChild == null);
	}

	/** gets the height of the node
	@param takes no arguments 
	@return returns the height of the node**/
	public int getHeight(){
		return getHeight(this); // call the preceeding method (private version of getHeight())
	}

	private int getHeight(BinaryNode<T> node){
		int height = 0;
		if (node != null){
			height = 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));
		}
		return height;
	}

	/** gets the number of nodes 
	@param takes no arguments
	@return returns the number of nodes **/
	public int getNumberOfNodes(){
		int leftNumber = 0;
		int rightNumber = 0;

		if (leftChild != null){
			leftNumber = leftChild.getNumberOfNodes();
		}
		if (rightChild != null){
			rightNumber = rightChild.getNumberOfNodes();
		}

		return 1+leftNumber+rightNumber;
	}

	/** copies the node and its children
	@param takes no arguments
	@return returns a copy of the node including the references to its children **/
	public BinaryNode<T> copy(){
		BinaryNode<T> newRoot = new BinaryNode<>(data);

		if (leftChild != null){
			newRoot.setLeftChild(leftChild.copy());
		}
		if (rightChild != null){
			newRoot.setRightChild(rightChild.copy());
		}

		return newRoot;
	}
}