package src;

public abstract class Action extends Entity{
	protected Human executor;

	protected Action subAction;

	public Action(Human executor){
		super("Action");

		setExecutor(executor);
	}

	public void setExecutor(Human executor){
		this.executor = executor;
	}

	// Add exception - if act == this
	public void setSubAction(Action subAction) throws RecursiveBindingException{
		if(subAction.equals(this))
			throw new RecursiveBindingException("SubAction cannot equals binding class");
		this.subAction = subAction;
	}

	public abstract void execute();

	public void executeSubAction(){
		if(subAction == null) return;
		subAction.execute();
	}

	@Override
	public String toString(){
		String executorName = executor != null ? executor.getName() : "[NO_EXECUTOR]";
		return super.toString() + "[" +
			"\n\tExecutor: " + executorName +
		"\n]";
	}

	@Override
	public int hashCode(){
		return (super.hashCode() + executor.hashCode() + subAction.hashCode()) * 666 % 77
	}

	@Override
	public boolean equals(Action a){
		return this == a && a.hashCode == hashCode() && name.equals(a.name)
			   && executor.equals(a.executor) && subAction.equals(a.subAction);
	}
}