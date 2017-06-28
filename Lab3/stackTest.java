/** Program that tests the Stack ADT. Here we forego secure programming and willingly show use of stacks.
@ author Diego Magdaleno
@ Version 1.0 **/

class stackTest{
	public static void main(String[] args){
		// create new stack object
		LinkedListInterface<String> s = new Stack<String>();
		System.out.println("New stack created.");

		// is the stack empty? Should be yes
		System.out.println("\n The stack is empty: "+s.isEmpty()); // should have "false" at the end

		// add items to the stack and print 
		s.insert("Apple");
		s.insert("Red");
		s.insert("Two");
		s.insert("Fish");
		s.printList(); // should print "Fish Two Red Apple "
		System.out.println(s.size()); // should be 4

		// remove item(s) 
		s.remove();
		s.remove();
		s.printList(); // should print "Red Apple "
		System.out.println(s.size()); // should be 2

		// empty the stack
		s.peek(); // should print "Red"
		s.clearAll();
		System.out.println(s.size()); // should be 0
		s.printList(); // should print "Empty."
		s.remove(); // should print "The stack is already empty."
		System.out.println("The stack is empty: "+s.isEmpty()); // should have "true" at the end
	}
}