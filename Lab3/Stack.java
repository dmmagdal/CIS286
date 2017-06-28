/** Linkedlist implementation of a stack
@ author Diego Magdaleno
@ Version 1.0 **/

public final class Stack<T> implements LinkedListInterface<T>{
	private int numberOfItems;	// stores the number of book titles that are in the list
	private Node topOfStack;	// a pointer to the top of the stack

	/** this is a simple constrcutor to initialize a new linkedlist
	@param tatkes no arguments
	@return returns nothing **/
	public Stack(){
		topOfStack = null;
		numberOfItems = 0;
	}

	/** adds a new sentry to the top of the stack (push() function)
	@param takes the argument title which is of type T
	@return returns nothing **/
	public void insert(T entry){
		Node n = new Node(entry);
		n.next = topOfStack;
		topOfStack = n;
		numberOfItems++;
	}

	/** removes a entry from the (top) of the list (pop() function)
	@param takes no arguments
	@return returns nothing **/
	public void remove(){
		if (!isEmpty()){
			topOfStack = topOfStack.next;
			numberOfItems--;
		}
		else{
			System.out.println("The stack is already empty.");
		}
	}

	/** prints out what is at the top of the stack (peek() function)
	@param takes no arguments
	@return returns nothing **/
	public void peek(){
		System.out.println(topOfStack.data);
	}

	/** prints the entire stack
	@param takes no arguments
	@return returns nothing **/
	public void printStack(){
		if (!isEmpty()){
			Node curr = topOfStack;
			while (curr != null){
				System.out.print(curr.data+" ");
				curr = curr.next;
			}
		}
		else{
			System.out.println("Empty.");
		}
	}	

	/** tells whether or not the stack is empty
	@param takes no arguments
	@return returns true if list is empty and returns false if list is not empty **/
	public boolean isEmpty(){
		boolean empty = false;
		if (numberOfItems == 0 || topOfStack = null){
			empty = true;
		}
		return empty;
	}

	/** clears out the entire stack
	@param takes no arguments
	@return returns nothing **/
	public void clearAll(){
		while (!isEmpty()){
			remove();
		}
	}

	/** just gives how many entries are on the stack
	@param takes no arguments
	@return returns the number of items variable **/
	public int size(){
		return numberOfItems;
	}

	// private class creates node objects for the linkedlist
	private class Node{
		private T data; // holds the data part of a node
		private Node next; // pointer to the next node (in the linkedlist)

		/** constructor to initialize a new node for the linkedlist. It takes in the argument entry and sets the 'data' 
		part ot that while the 'next' part to null
		@param takes the argument entry which is of type T 
		@return returns nothing **/
		private Node(T entry){
			data = entry;
			next = null;
		}
	}
}