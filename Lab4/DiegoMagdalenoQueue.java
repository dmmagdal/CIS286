/** Linkedlist implementation of a queue
@ author Diego Magdaleno
@ Version 1.0 **/

public final class Queue<T>{
	private int numberOfItems;	// stores the number of items in the queue
	private Node front;	// a pointer to the front of the queue
	private Node back; // a pointer to the back of the queue

	/** this is a simple constructor to initialize a new linkedlist
	@param tatkes no arguments
	@return returns nothing **/
	public Queue(){
		front = null;
		back = null;
		numberOfItems = 0;
	}

	/** adds a new entry to back for the queue (enqueue() function)
	@param takes the argument of an entry which is of type T
	@return returns true if it succeeded in adding the entry and false if it doesn't **/
	public boolean enqueue(T entry){;
		Node n = new Node(entry);
		if (isEmpty()){ // in the event that the queue is empty, front and back are the same
			front = n;
			back = front;
		}
		else{ // otherwise, the queue is not empty, so we add the entry to the back and set back equal to that node
			n.next = back;
			back = n;
		}
		numberOfItems++;
		return true;
	}

	/** removes an entry from the front of the queue (dequeue() function)
	@param takes no arguments
	@return returns the data from the front of the queue (or null if it didn't succeed in removing the node or the queue is empty) **/
	public T dequeue(){
		Node n = front;
		if (!isEmpty() && numberOfItems != 1){ // if the queue is not empty or there are more than one items in the queue, remove the front node and reset it
			front = getPrev(front); // set front to the node before it
			front.next = null; // severe reference to the "old front" by setting the next pointer to null on the new front
			numberOfItems--;
		}
		else if (!isEmpty() && numberOfItems == 1){ // if there is only one item in the queue, set the front and back equal to null
			front = null; // since there is only one item in the queue and we're dequeuing, we set the back and fromt to null
			back = front;
			numberOfItems--;
		}
		return n.data;
	}

	/** retrieves what is at the front of the queue (getFront() function)
	@param takes no arguments
	@return returns a reference to the node front **/
	public T peek(){
		return front.data;
	}

	/** prints the entire queue from back to front
	@param takes no arguments
	@return returns nothing **/
	public void printList(){
		if (!isEmpty()){ // if the queue is not empty, it traverses the queue, printing the data held at each node
			System.out.print("Queue: ");
			Node curr = back;
			while (curr != null){
				System.out.print(toString(curr)+" ");
				curr = curr.next;
			}
		}
		else{ // assumes that the queue must be empty and prints the following
			System.out.println("Queue is Empty.");
		}
	}	

	/** tells whether or not the queue is empty
	@param takes no arguments
	@return returns true if the queue is empty and returns false if it is not **/
	public boolean isEmpty(){
		boolean empty = false;
		if (numberOfItems == 0 || front == null){ // if the number of elements in the queue = 0 or the front points to null, the queueu is empty
			empty = true;
		}
		return empty;
	}

	/** clears out the entire queue and returns how many elements were in the queue before it was erased
	@param takes no arguments
	@return returns the number of elements that were in the queue before it was cleared **/
	public int clear(){
		System.out.println("Clearing queue...");
		int numberOfElements = numberOfItems; // temporary varialbe to store the number of elements in the queue prior it being erased
		while (!isEmpty()){ // traversing the queue, erasing each node as is goes
			T n = dequeue();
		}
		System.out.println("Queue cleared.");
		return numberOfElements;
	}

	/** just gives how many entries are in the queue
	@param takes no arguments
	@return returns the number of items variable **/
	public int size(){
		return numberOfItems;
	}

	/** traverses the queue and gets a reference to the previous node of the argument
	@param takes the argument node current as the target node
	@return returns a reference to the previous node of the target if it exists or null if it does not **/
	private Node getPrev(Node current){
		Node prev; // prev is the reference to the Node we're returning, so we're setting it to back for ease
		boolean found = false;
		if (numberOfItems == 1 || isEmpty()){ // if there is one element in the queue or it's empty, there is no node that comes before that element
			prev = null;
		}
		else{ // otherwise, there are more than one elements in the queue, so we can traverse the queue looking for the previous node to our target
			prev = back; // so we set prev to be the back when starting the traversal
			while (prev != null && found == false){
				if (prev.next == current){
					found = true;	// if the next node in the queue is our target node, we've found our node previous to our target, so we stop traversing the queue
				}
				else{ // otherwise, keep going and iterating through the queue
					prev = prev.next;
				}
			}
		}
		return prev; 
	}

	/** converts the data in a node to string
	@param takes the targeet Node as an argument
	@return retuns the data portion of the node as a string **/
	private String toString(Node n){
		return n.data.toString();
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