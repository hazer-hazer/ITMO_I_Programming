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

	public void setSubAction(Action act){
		subAction = act;
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
}