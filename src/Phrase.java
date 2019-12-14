package src;

public class Phrase extends Entity implements IPhrase{
	protected String preText = "";
	protected String postText = "";
	protected Adverb adverb;
	protected Utterance utterance;

	public Phrase(){
		super("Phrase");
	}

	public Phrase setPreText(String preText){
		this.preText = preText;
		return this;
	}
	public Phrase setPostText(String postText){
		this.postText = postText;
		return this;
	}
	public Phrase setAdverb(String adverb){
		this.adverb = Adverb.valueOf(adverb.toUpperCase());
		return this;
	}
	public Phrase setUtterance(String utterance){
		this.utterance = Utterance.valueOf(utterance.toUpperCase());
		return this;
	}
	
	public String getPreText(){
		return preText;
	}

	public String getPostText(){
		return postText;
	}

	public String getAdverb(){
		return adverb != null ? adverb.toString() : "";
	}
	
	public String getUtterance(){
		return utterance != null ? utterance.toString() : "";
	}

	protected static enum Adverb{
		FINALLY, SHYLY, RAPID;
	}

	protected static enum Utterance{
		CONTINUED, ASKED, STARTED, INTERRUPTED, EXPLAINED, SAID, SHOUTED, ANSWERED;
	}

	@Override
	public String toString(){
		return super.toString() + ";\n[" +
			"\n\tPreText: " + preText +
			"\n\tPostText: " + postText +
			"\n\tAdverb: " + adverb +
			"\n\tUtterance: " + utterance +
		"\n]";
	}

	@Override
	public int hashCode(){
		return (super.hashCode() + preText.hashCode() + utterance.hashCode()
				+ adverb.hashCode() + postText.hashCode()) * 666 % 77;
	}
}