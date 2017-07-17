/** interface for trees
@auther Frank M. Carrano
@auther Timothy M. Henry
Version 4.0 **/

public interface TreeInterface<T>{
	/** get the data stored in the root
	@param takes no arguments
	@return returns the data stored in the root node **/
	public T getRootData();

	/** gets the height of the tree
	@param takes no arguments
	@return returns the height of the tree **/
	public int getHeight();

	/** gets the number of nodes in the tree
	@param takes no arguments
	@return returns the number of nodes in the tree **/
	public int getNumberOfNodes();

	/** tells if the tree is empty
	@param takes no arguments
	@return returns true if root is null and false if it's empty **/
	public boolean isEmpty();

	/** clears the tree
	@param takes no arguemnts
	@return returns nothing **/
	public void clear();
}