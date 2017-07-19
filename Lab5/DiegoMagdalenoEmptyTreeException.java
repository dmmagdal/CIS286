public class EmptyTreeException extends RuntimeException{
	public EmptyTreeException(){
		super("Can not perform operation on an empty tree.");
	}
}