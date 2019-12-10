package src;

public class MentalAction extends Action{
	protected Type type = Type.THINK;

	public MentalAction(Human executor){
		super(executor);
		name = "Mental" + name;
	}

	@Override
	public void execute(){
		print(executor.getName() + ":Execute MentalAction", type.toString());

		executeSubAction();
	}

	public MentalAction setType(String type){
		this.type = Type.valueOf(type.toUpperCase());
		return this;
	}

	private static enum Type{
		THINK, FORGET, OVERLOOK, BADLUCK, GOODLUCK;
	}

	@Override
	public String toString(){
		return super.toString() + ";\n[" +
			"\n\t type: " + type +
		"\n]";
	}
}