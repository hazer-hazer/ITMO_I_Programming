package src;

public class ActionFactory{
    private static ActionFactory instance = null;

	private ActionFactory(){}

	public static ActionFactory getInstance(){
		if(instance == null)
			instance = new ActionFactory();

		return instance;
	}

	public Action create(String type, Human executor){
		if("mental".equalsIgnoreCase(type))
			return new MentalAction(executor);

		return null;
	}
}