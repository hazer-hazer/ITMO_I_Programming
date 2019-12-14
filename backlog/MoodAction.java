public class MoodAction extends Action{
	protected Mood mood;

	public void setMood(String mood){
		this.mood = Mood.valueOf(mood);
	}

	public void setMood(Mood mood){
		this.mood = mood;
	}

	public Mood getMood(){
		return mood;
	}
}