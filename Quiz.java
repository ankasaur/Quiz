
public class Quiz {
	
	public static void main(String[] args) {
		Question question = new MultipleChoiceQuestion("What continent is also a country?", "Antarctica", "Australia", "America", "Africa", "Asia", "b");
		question.check();
		
		question = new TrueFalseQuestion("We share 50% of our DNA with our parents", "t");
		question.check();
		
		question = new MultipleChoiceQuestion("What fruit is also a color?", "Orange", "Apple", "Banana", "Papaya", "Kiwi", "a");
		question.check();
		
		question = new TrueFalseQuestion("There are 8 blood groups in total", "t");
		question.check();
		
		question = new MultipleChoiceQuestion("Is Schrodinger's Cat Dead or Alive?", "Dead", "Alive", "Neither Dead nor Alive", "Both Dead and Alive", "for (life = 9; life > 0; life--) the cat is alive", "d");
		question.check();
		
		question = new TrueFalseQuestion("Killer whales are whales", "f");
		question.check();
		
		question = new MultipleChoiceQuestion("What existing living creature is called a Unicorn?", "Horse", "Narwhal", "Rhino", "Zombie Ant", "Leatherjacket fish", "b");
		question.check();
		
		question = new TrueFalseQuestion("Potato is a good source of Vitamin C", "t");
		question.check();
		
		question = new MultipleChoiceQuestion("What disease can Mantis Shrimps see that Humans cannot?", "Cancer", "Anemia", "Depression", "Diabetes", "Hypertension", "a");
		question.check();
		
		question = new TrueFalseQuestion("Jellyfish have more wrinkled brain than koalas", "f");
		question.check();
		
		Question.showResults();
		
	}
}