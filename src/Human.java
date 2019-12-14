package src;

public class Human extends Entity{

	public Human(){
		super("Human");
	}
	public Human(String name){
		super(name);
	}

	public void say(Phrase phrase){
		// Beautifying...
		String preText = phrase.getPreText();
		preText = preText.length() > 0 ? "`" + preText + "` -" : "";
		String postText = phrase.getPostText();
		postText = postText.length() > 0 ? " - `" + postText + "`" : "";

		print("Say", preText, phrase.getAdverb(), phrase.getUtterance(), name, postText);
	}

	@Override
	public int hashCode(){
		return super.hashCode() * 666 % 77;
	}

	@Override
	public String toString(){
		return super.toString() + "; Human"; 
	}

	@Override
	public boolean equals(Human h){
		return h.hashCode() == hashCode() && this == h && super.equals(h);
	}
}