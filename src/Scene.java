package src;

import java.util.ArrayList;
import java.util.*;

public class Scene{
	private List <Action> actions = new ArrayList <Action>();

	public Scene(){}

	public Scene addAction(String type, Human executor){
		if("mental".equalsIgnoreCase(type))
			actions.add(new MentalAction(executor));
		else if("phrase".equalsIgnoreCase(type))
			actions.add(new PhraseAction(executor));
		
		return this;
	}

	public PhraseAction getLastPhraseAction(){
		return (PhraseAction) actions.get(actions.size() - 1);
	}

	public MentalAction getLastMentalAction(){
		return (MentalAction) actions.get(actions.size() - 1);
	}

	public void run(){
		for(Action a : actions)
			a.execute();
	}
}