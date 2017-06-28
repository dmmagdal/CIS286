/** Interface for the stack class
@ author Diego Magdaleno
@ Version 1.0 **/

public interface LinkedListInterface<T>{
	private int numberOfItems;	// stores the number of book titles that are in the list
	private Node head;	// a pointer to the top of the list

	/** this is a simple constrcutor to initialize a new linkedlist
	@param tatkes no arguments
	@return returns nothing **/
	public LinkedList();

	/** adds a new entry to the top of the list
	@param takes the argument title which is of type T
	@return returns nothing**/
	public void insert(T entry);

	/** removes a entry from the (top) of the list
	@param takes no arguments
	@return returns the data stored in the deleted node **/
	public void remove();

	/** print out the entire list
	@param takes no arguments
	@return returns nothing **/
	public void printList();

	/** tells whether or not the list is empty
	@param takes no arguments
	@return returns true if list is empty and returns false if list is not empty **/
	public boolean isEmpty();

	/** clears out the entire stack
	@param takes no arguments
	@return returns nothing **/
	public void clearAll();

	/** just gives how many entries are on the stack
	@param takes no arguments
	@return returns the number of items variable **/
	public int size();

	// private class creates node objects for the linkedlist
	private class Node{
		private T data; // holds the data part of a node
		private Node next; // pointer to the next node (in the linkedlist)

		/** constructor to initialize a new node for the linkedlist. It takes in the argument entry and sets the 'data' 
		part ot that while the 'next' part to null
		@param takes the argument entry which is of type T 
		@return returns nothing **/
		private Node(T entry);
	}
}