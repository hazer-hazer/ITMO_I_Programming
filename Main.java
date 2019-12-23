import src.*;

public class Main{
	public static void main(String[] args) {
		Human sonya = new Human("Sonya");
		Human alice = new Human("Alice");
		Human hat = new Human("Hat");
		Scene scene = new Scene();
			
		// Throw RecursiveBindingException

		// MentalAction ma = new MentalAction(sonya);
		// ma.setSubAction(ma);

		

		/*
		- Так вот,- наконец возобновила свой рассказ Соня,
		- они таскали мармалад оттуда...
		*/
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("So")
			 .setAdverb("finally")
			 .setUtterance("continued")
			 .setPostText("They stole jelly");

		/*
		- Откуда взялся мармелад?..- начала было Алиса,
		забыв о своем торжественном обещании, и тут же осеклась.
		*/
		scene.addAction("phrase", alice)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("Where did marmelad come from?")
			 .setUtterance("started");

		/* 
		, забыв о своем торжественном обещании, и тут же осеклась.
		*/
		scene.addAction("mental", alice)
			 .getLastMentalAction()
			 .setType("forget")
			 .setPreposition("about")
			 .setSubject("solemn promise");

		scene.bindLast();

		/*
		Но Соня, казалось, ничего не заметила.
		*/
		scene.addAction("mental", sonya)
			 .getLastMentalAction()
			 .setType("overlook");

		/*
		- Это был мармаладный колодец,- объяснила она.
		*/
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("It was marmelad-well")
			 .setUtterance("explained");

		/*
		- Мне нужна чистая чашка,
		- прервал ее Шляпа.- Давайте подвинемся!
		*/
		scene.addAction("phrase", hat)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("I need clean cup")
			 .setUtterance("interrupted")
			 .setPostText("Let's move up");

		/*
		Он тут же пересел на соседний стул;
		Соня села на его место. Заяц - на место Сони,
		а Алиса - без особой охоты - пересела на стул Зайца.
		*/

		/*
		От всех этих перемещений выиграл только Шляпа, 
		*/
		scene.addAction("mental", hat)
			 .getLastMentalAction()
			 .setType("goodluck");

		/*
		а Алиса, наоборот, сильно прогадала,
		так как Заяц только что опрокинул молочник.
		*/
		scene.addAction("mental", alice)
			 .getLastMentalAction()
			 .setType("badluck");

		/*
		- Я не понимаю,- очень робко, [боясь опять рассердить Соню],
		начала Алиса,- как же они таскали оттуда мармелад?
		*/
		scene.addAction("phrase", alice)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("I don't understand")
			 .setAdverb("shyly")
			 .setUtterance("started")
			 .setPostText("how did they drag marmelad from there?");

		/*
		- Из обыкновенного колодца таскают воду, - сказал Шляпа,
		- а из мармеладного колодца всякий может,
		я надеюсь, таскать мармелад. Ты что - совсем дурочка?
		*/
		scene.addAction("phrase", hat)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("Water is dragged from an ordinary well")
			 .setUtterance("said")
			 .setPostText("and from marmelad-well anyone can drag marmelad, I hope. Are you stupid?");

		/*
		 - Я говорю, как они могли таскать мармелад оттуда?
		 Ведь они там жили- сказала Алиса,
		 - решив оставить без ответа последние слова Шляпы.
		*/
		scene.addAction("phrase", alice)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("I'm telling you, how could they drag marmelad from there? They lived there")
			 .setUtterance("said");

		/*
		 - Не только жили! - сказала Соня.- Они жили-были!
		*/
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("Not only lived!")
			 .setUtterance("said")
			 .setPostText("They lived, they were!");

		/**
		 И этот ответ настолько ошеломил бедную Алису,
		*/
		scene.addAction("mental", alice)
			 .getLastMentalAction()
			 .setType("stunned");

		scene.bindLast();

		/**
		 - Так вот,- продолжала Соня,
		 - этот самый мармадад они ели и пили - делали что хотели...
		*/

		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("So")
			 .setUtterance("continued")
			 .setPostText("they ate and drank this marmelad - did what they wanted");

		/**
		Тут Алиса не выдержала. - Как же это они пили мармелад?!
		- закричала она.- Этого не может быть!
		*/
		scene.addAction("mental", alice)
			 .getLastMentalAction()
			 .setType("madden");

		scene.addAction("phrase", alice)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("How could they drink marmelad?!")
			 .setUtterance("shouted")
			 .setPostText("IMPOSSIBLE!");
		
		scene.bindLast();

		/**
		- А кто сказал, что они его пили? - спросила Соня.
		*/
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("Who said that ate it?")
			 .setUtterance("asked");

		/**
		- Как - кто? Вы сами сказали.
		*/
		scene.addAction("phrase", alice)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("What does it mean - who? You said");

		/**
		- Я сказала - они его ели! - ответила Соня.
		*/
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("I said - they ate it!")
			 .setUtterance("answered");
		scene.addAction("phrase", sonya)
			 .getLastPhraseAction()
			 .getPhrase()
			 .setPreText("Ate and sculpt! Sculpt anything they wanted from it - anything that starts with M")
			 .setUtterance("continued");

		scene.bindLast();

		scene.run();
	}
}