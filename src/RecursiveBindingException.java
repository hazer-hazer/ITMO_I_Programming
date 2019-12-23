package src;

public class RecursiveBindingException extends RuntimeException{
	public RecursiveBindingException(String message){
		super(message);
	}

	public RecursiveBindingException(){
		super("SubAction binded to `this` Action");
	}
}