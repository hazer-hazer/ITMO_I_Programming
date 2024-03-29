package src;

public class MentalAction extends Action{
	protected Type type = Type.THINK;
	protected String subject = "";
	protected String preposition = "";

	public MentalAction(Human executor){
		super(executor);
		name = "Mental" + name;
	}

	@Override
	public void execute(){
		executor.print(type.toString(), "(Mental)", preposition, subject);
	}

	public MentalAction setType(String type){
		this.type = Type.valueOf(type.toUpperCase());
		return this;
	}

	private static enum Type{
		THINK, FORGET, OVERLOOK, BADLUCK, GOODLUCK, STUNNED, MADDEN;
	}

	public MentalAction setSubject(String subject){
		this.subject = subject;
		return this;
	}

	public MentalAction setPreposition(String preposition){
		this.preposition = preposition;
		return this;
	}

	@Override
	public String toString(){
		return super.toString() + ";\n[" +
			"\n\t type: " + type +
		"\n]";
	}

	@Override
	public int hashCode(){
		return (super.hashCode() + type.hashCode() + subject.hashCode() + preposition.hashCode()) * 666 % 77;
	}
}