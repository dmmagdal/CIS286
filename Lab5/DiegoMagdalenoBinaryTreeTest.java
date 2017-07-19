/** builds a binary tree and prints out the nodes in inorder preorder and postorder
@author Diego Magdaleno
@version 1.0 **/

class BinaryTreeTest{
	public static void main(String[] args){
		// set leaves
		BinaryTree<String> node1 = new BinaryTree<>();
		node1.setTree("7");
		BinaryTree<String> node2 = new BinaryTree<>();
		node2.setTree("10");
		BinaryTree<String> node3 = new BinaryTree<>();
		node3.setTree("11");
		BinaryTree<String> node4 = new BinaryTree<>();
		node4.setTree("8");
		BinaryTree<String> node5 = new BinaryTree<>();
		node5.setTree("3");
		BinaryTree<String> node6 = new BinaryTree<>();
		node6.setTree("5");

		// set nodes that connect to children 
		BinaryTree<String> node7 = new BinaryTree<>();
		node7.setTree("9", node1, node2);
		BinaryTree<String> node11 = new BinaryTree<>();
		node11.setTree("6", node5, node6);
		BinaryTree<String> node10 = new BinaryTree<>();
		node10.setTree("4", node11, node4);
		BinaryTree<String> node8 = new BinaryTree<>();
		node8.setTree("2", node3, node10);
		BinaryTree<String> node9 = new BinaryTree<>(); // root node of the whole tree
		node9.setTree("1", node7, node8);

		// print in inorder
		System.out.print("In order traversal: ");
		node9.inOrderTraverse();
		System.out.println("\n");
		// print in preorder 
		System.out.print("Pre order traversal: ");
		node9.preOrderTraverse();
		System.out.println("\n");
		// print in postorder
		System.out.print("Post order traversal: ");
		node9.postOrderTraverse();
	}
}