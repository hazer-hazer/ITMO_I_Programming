import src.*;

public class Test{
	public static void main(String[] args) {
		String scriptText = String.join("\n",
			"Alice MentalAction { type: overlook }"
		);
		Script script = new Script(scriptText);
		script.parse();
	}
}