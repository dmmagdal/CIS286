// Bag.java
// Diego Magdaleno
// June 16. 2017
// Lab1
// This class creates an int array and checks to see if it and another array are equal

class Bag{
	public int[] bag;
	private int bagSize;

	/** Intitailize a new Bag class
	@parem takes the size of the bag to create the int array of that size
	@return returns nothing**/
	public Bag(int size){
		bagSize = size;
		bag = new int[size];
	}

	/** Intitailize a new Bag class
	@parem takes the size of the bag to create the int array of that size
	@return returns nothing**/
	public void toArray(int[] array){
		if (array.length != bagSize){
			System.out.println("Error: Array bounds are not the same as bag size.");
		}
		else{
			bag = array;
		}
	}

	/** checks the bag and otherArray to see if they're equal but checking that they're both of same size and have the same entries
	@parem takes the int[] otherArray as an argument to see if it and the bag are equal
	@return returns true if the bag and otherArray are equal and false if the bag and otherArray are not equal**/
	public boolean equals(int[] otherArray){
		boolean equal = false;
		if (bagSize == otherArray.length && sameEntries(otherArray)){
			equal = true;
		}
		return equal;
	}

	/** runts through both the bag and otherArray to see if they both only eachother's entries
	@parem takes the int[] otherArray as an argument to check if it and the bag have the same entries
	@return returns true if both the bag and otherArray have the same entries and false if the bag and otherArray don't have the same entries**/
	private boolean sameEntries(int[] otherArray){
		boolean same = true;
		for (int index = 0; index < bagSize; index++){
			if (!contains(bag[index], otherArray) || !contains(otherArray[index], bag)){
				same = false;
			}
		}
		return same;
	}

	/** checks to see if an entry is within an array
	@parem takes the int entry as a query and int[] otherArray to see if the query exists in the array
	@return returns false if the entry is not in otherArray and true if entry is in otherArray**/
	private boolean contains(int entry, int[] otherArray){
		boolean found = false;
		int index = 0;
		while (index < bagSize && !found){
			if (entry == otherArray[index]){
				found = true;
			}
			index++;
		}
		return found;
	}
}