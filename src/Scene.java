package src;

import java.util.ArrayList;
import java.util.*;

public class Scene{
	private List <Action> actions = new ArrayList <Action>();

	public Scene(){}

	private Action createAction(String type, Human executor){
		if("mental".equalsIgnoreCase(type))
			return new MentalAction(executor);
		else if("phrase".equalsIgnoreCase(type))
			return new PhraseAction(executor);

		return null;
	}

	public Scene addAction(String type, Human executor){
		actions.add(createAction(type, executor));
		return this;
	}

	public Action getLastAction(){
		return actions.get(actions.size() - 1);
	}

	public PhraseAction getLastPhraseAction(){
		return (PhraseAction) getLastAction();
	}

	public MentalAction getLastMentalAction(){
		return (MentalAction) getLastAction();
	}

	// Make last Action a subAction of one before it
	public void bindLast(){
		if(actions.size() < 2) return;

		actions.get(actions.size() - 2).setSubAction(getLastAction());
		actions.remove(actions.size() - 1);
	}

	public void run(){
		for(Action a : actions)
			a.execute();
	}
}