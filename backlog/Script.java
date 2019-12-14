package src;

import java.util.*;

public class Script extends Entity{
	private String scriptText;

	public Script(String scriptText){
		this.scriptText = scriptText;
	}

	public void parse(){
		List <String> lines = new ArrayList<>();
		lines = Arrays.asList(scriptText.split("\n"));

		for(String line : lines)
			print(line);
	}
}