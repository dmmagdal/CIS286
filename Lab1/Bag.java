// Bag.java


class Bag{
	public int[] bag;
	private int bagSize;

	public Bag(int size){
		bagSize = size;
		bag = new int[size];
	}

	public void toArray(int[] array){
		if (array.length != bagSize){
			System.out.println("Error: Array bounds are not the same as bag size.");
		}
		else{
			bag = array;
		}
	}

	public boolean equals(int[] otherArray){
		boolean equal = false;
		if (bagSize == otherArray.length && sameEntries(otherArray)){
			equal = true;
		}
		return equal;
	}

	private boolean sameEntries(int[] otherArray){
		boolean same = true;
		for (int index = 0; index < bagSize; index++){
			if (!contains(bag[index], otherArray) && !contains(otherArray[index], bag)){
				same = false;
			}
		}
		return same;
	}

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