// BagTest.java
// Diego Magdaleno
// June 16. 2017
// Lab1
// Tests the Bag class of Bag.java with fixed int arrays

class BagTest{
	public static void main(String[] args){
		// initialize new bags
		Bag a = new Bag(3);
		Bag b = new Bag(5);
		Bag c = new Bag(5);
		Bag d = new Bag(5);
		Bag e = new Bag(3);

		// create fixed arrays
		int[] aPrime = {5, 2, 1};
		int[] bPrime = {7, 9, 10, 2, 2};
		int[] cPrime = {10, 2, 7, 2, 9};
		int[] dPrime = {10, 9, 1, 2, 1};
		int[] ePrime = {1, 5, 2};

		// set the bags equal to the arrays made above
		a.toArray(aPrime);
		b.toArray(bPrime);
		c.toArray(cPrime);
		d.toArray(dPrime);
		e.toArray(ePrime);

		// print out the bags
		System.out.println("A: ");
		for (int i = 0; i < a.bag.length; i++){
			System.out.print(a.bag[i]+" ");
		}
		System.out.println("\nB: ");
		for (int i = 0; i < b.bag.length; i++){
			System.out.print(b.bag[i]+" ");
		}
		System.out.println("\nC: ");
		for (int i = 0; i < c.bag.length; i++){
			System.out.print(c.bag[i]+" ");
		}
		System.out.println("\nD: ");
		for (int i = 0; i < d.bag.length; i++){
			System.out.print(d.bag[i]+" ");
		}
		System.out.println("\nE: ");
		for (int i = 0; i < e.bag.length; i++){
			System.out.print(e.bag[i]+" ");
		}

		System.out.println("\n");

		// print the comparison between each bag
		System.out.println("A and B are equal: "+a.equals(b.bag));
		System.out.println("A and C are equal: "+a.equals(c.bag));
		System.out.println("B and C are equal: "+b.equals(c.bag));
		System.out.println("B and D are equal: "+b.equals(d.bag));
		System.out.println("A and E are equal: "+a.equals(e.bag));
		System.out.println("C and E are equal: "+c.equals(e.bag));
	}
}