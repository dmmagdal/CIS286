/** Program that tests the Queue ADT. Here we forego secure programming and willingly show use of queues.
@ author Diego Magdaleno
@ Version 1.0 **/

class queueTest{
	public static void main(String[] args){
		// create new queue object
		Queue<String> s = new Queue<String>();
		System.out.println("New queue created.");

		// is the queue empty? Should be yes
		System.out.println("\nThe queue is empty: "+s.isEmpty()+".\n"); // should have "true" at the end

		String[] items = {"Apple", "Red", "Two", "Fish", "Make", "Blue", "Red"}; // string array that holds test data for the queue

		// add items to the queue and print 
		for (int i = 0; i < items.length-3; i++){ // traverse array and add array elements all the way up to "Fish"
			if (s.enqueue(items[i])){ // execute if the enqueue was successful
				System.out.println(items[i]+" added to queue."); // say that the item was successfully added
				s.printList(); // print the queue to prove the item was successfully added
				System.out.println("\n");
			}
			else{ // otherwise, the element was not successfully enqueued
				System.out.println("failed to add "+items[i]+" to queue.\n"); // print this "error" message saying that the element wasn't successfully added
			}
		}
		System.out.println("There are "+s.size()+" items in the queue.\n"); // size should be 4 after the enqueues

		// is the stack empty now? Should be no
		System.out.println("The queue is empty: "+s.isEmpty()+".\n"); // should have "false" at the end

		// remove item(s) 
		for (int i = 0; i < 2; i++){ // should iterate to remove 2 items from the queue
			System.out.println(s.dequeue()+" removed from queue."); // prints what was dequeued 
			s.printList(); // print queue to prove the items have been dequeued
			System.out.println("\n");
		}
		System.out.println("There are "+s.size()+" items in the queue.\n"); // size should be 2 after the dequeues

		// add some more things just to change up the queue
		for (int i = 3; i < items.length; i++){ // add the rest of the items fromt he array (will repeat starting from "Fish")
			if (s.enqueue(items[i])){ // same procedure as the first set of enqueues
				System.out.println(items[i]+" added to queue.");
				s.printList();
				System.out.println("\n");
			}
			else{
				System.out.println("failed to add "+items[i]+" to queue.\n");
			}
		}
		System.out.println("There are "+s.size()+" items in the queue.\n"); // size should be 6 after the final enqueues

		// test the peek function
		System.out.println(s.peek()+" is at the front of the queue.\n"); // should print the front of the queue ("Two")

		// clear the queue
		s.clear();
		System.out.println("\n");
		System.out.println("There are "+s.size()+" items in the stack."); // size should be 0 after the queue is cleared
		s.printList(); // should print "Queue is Empty." since the queue should have no entries
		System.out.println("\n");

		
		// call dequeue on an empty queue
		System.out.println(s.dequeue()+"\n"); // should print "null"
		

		System.out.println("The queue is empty: "+s.isEmpty()+".\n"); // should have "true" at the end
	}
}