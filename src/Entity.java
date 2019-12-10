package src;

public abstract class Entity{
	protected String name;

	public Entity(){
		this("Entity");
	}
	public Entity(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void print(String method, String ...messages){
		System.out.println('[' + name + "]:" + method + ' ' + String.join(" ", messages));
	}
	public void log(String ...messages){
		print("[LOG]", messages);
	}
	public void printSelf(){
		print("[SELF]", toString());
	}
	public void error(Exception e){
		print("[ERROR]", e.getMessage());
	}


	@Override
	public String toString(){
		return "(" + name + ") ";
	}
}