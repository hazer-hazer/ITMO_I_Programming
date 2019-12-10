package src;

public class PhraseAction extends Action{
	private Phrase phrase;

	public PhraseAction(Human executor){
		super(executor);
		name = "Phrase" + name;
		phrase = new Phrase();
	}

	public Phrase getPhrase(){
		return phrase;
	}

	@Override
	public void execute(){
		executor.say(phrase);

		executeSubAction();
	}

	@Override
	public String toString(){
		return super.toString() + ";\n[" +
			"\n\t phrase: " + phrase.toString() +
		"\n]";
	}
}