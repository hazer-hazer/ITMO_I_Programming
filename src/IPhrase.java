package src;

public interface IPhrase{
	Phrase setPreText(String preText);
	Phrase setPostText(String postText);
	Phrase setAdverb(String adverb);
	Phrase setUtterance(String utterance);

	String getPreText();
	String getPostText();
	String getAdverb();
	String getUtterance();
}