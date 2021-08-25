import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question {
	
	MultipleChoiceQuestion(String question, String a, String b, String c, String d, String e, String answer) {
		super(question);
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		initQuestionDialog();
		correctAnswer = answer.toUpperCase();
	}
	
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout(10,0)); // adds 10px space between the buttons and the labels
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button, BorderLayout.WEST);
		choice.add(new JLabel(label + "    ", JLabel.LEFT), BorderLayout.CENTER);
		question.add(choice);
	}
}