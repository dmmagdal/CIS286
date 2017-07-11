/** Interface for a linked list
@ author Diego Magdaleno
@ Version 1.0 **/

public interface LinkedListInterface<T>{

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
}