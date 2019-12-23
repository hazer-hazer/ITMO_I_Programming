package src;

import java.util.ArrayList;
import java.util.*;

public class Scene extends Entity implements IScene, IExecutorFactory<Action>{
	private List <Action> actions = new ArrayList <>();

	public Scene(){
		super("Scene");
	}

	@Override
	public Action createAction(String type, Human executor){
		if("mental".equalsIgnoreCase(type))
			return new MentalAction(executor);
		else if("phrase".equalsIgnoreCase(type))
			return new PhraseAction(executor);

		return null;
	}

	@Override
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
	@Override
	public void bindLast(){
		if(actions.size() < 2) return;

		actions.get(actions.size() - 2).setSubAction(getLastAction());
		actions.remove(actions.size() - 1);
	}

	@Override
	public void run(){
		for(Action a : actions)
			a.execute();
	}

	@Override
	public int hashCode(){
		return (super.hashCode() + actions.hashCode()) * 666 % 77;
	}

	@Override
	public String toString(){
		return super.toString() + " [\n" + actions.toString() + "]";
	}

	public boolean equals(Scene s){
		return super.equals(s) && actions.equals(s.actions);
	}
}