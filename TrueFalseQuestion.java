import javax.swing.*;

public class TrueFalseQuestion extends Question {

	TrueFalseQuestion(String question, String answer) {
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		correctAnswer = valid(answer);
	}
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}
	
	String valid(String str) { 
		str = str.toUpperCase();
		String result = "";

		if (str.equals("T") || str.equals("TRUE") || str.equals("Y") || str.equals("YES")) {
			result = "TRUE";
		} else if (str.equals("F") || str.equals("FALSE") || str.equals("N") || str.equals("NO")) {
			result = "FALSE";
		}
		return result;
	}
}