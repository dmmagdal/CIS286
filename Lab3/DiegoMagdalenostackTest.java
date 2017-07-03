/** Program that tests the Stack ADT. Here we forego secure programming and willingly show use of stacks.
@ author Diego Magdaleno
@ Version 1.0 **/

class stackTest{
	public static void main(String[] args){
		// create new stack object
		Stack<String> s = new Stack<String>();
		System.out.println("New stack created.");

		// is the stack empty? Should be yes
		System.out.println("\nThe stack is empty: "+s.isEmpty()); // should have "true" at the end

		// add items to the stack and print 
		s.insert("Apple");
		s.printList(); // should print "Apple "
		System.out.println("\n");
		s.insert("Red");
		s.printList(); // should print "Red Apple "
		System.out.println("\n");
		s.insert("Two");
		s.printList(); // should print "Two Red Apple "
		System.out.println("\n");
		s.insert("Fish");
		s.printList(); // should print "Fish Two Red Apple "
		System.out.println("\n");
		System.out.println("There are "+s.size()+" items in the stack."); // should be 4

		// is the stack empty now? Should be no
		System.out.println("\nThe stack is empty: "+s.isEmpty()+"\n"); // should have "false" at the end

		// remove item(s) 
		s.remove();
		s.printList(); // should print "Two Red Apple "
		System.out.println("\n");
		s.remove();
		s.printList(); // should print "Red Apple "
		System.out.println("\n");
		s.insert("Make");
		s.printList(); // should print "Make Red Apple "
		System.out.println("There are "+s.size()+" items in the stack."); // should be 3

		// empty the stack
		s.peek();
		System.out.println(" is the top of the stack."); // should print "Make"
		System.out.println("\n");
		s.clearAll(); // should clear the stack
		System.out.println("\n");
		System.out.println("There are "+s.size()+" items in the stack."); // should be 0
		s.printList(); // should print "Stack is Empty."
		System.out.println("\n");
		s.remove(); // should print "The stack is already empty."
		System.out.println();
		System.out.println("The stack is empty: "+s.isEmpty()); // should have "true" at the end
	}
}