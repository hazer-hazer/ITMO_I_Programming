package src;

public class Human extends Entity{

	public Human(){
		super("Human");
	}
	public Human(String name){
		super(name);
	}

	public void say(Phrase phrase){
		String preText = phrase.getPreText();
		preText = preText.length() > 0 ? "`" + preText + "` -" : "";
		String postText = phrase.getPostText();
		postText = postText.length() > 0 ? " - `" + postText + "`" : "";
		print("Say", preText, phrase.getAdverb(), phrase.getUtterance(), name, postText);
	}
}