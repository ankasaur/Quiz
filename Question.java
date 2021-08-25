import java.awt.*;
import javax.swing.*;
import java.sql.Timestamp;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	static long startTime = new Timestamp(System.currentTimeMillis()).getTime();
	static long finishTime = 0;
	
	QuestionDialog question;
	String correctAnswer;
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1,0,5)); // adds horizontal 5px space between rows
		this.question.add(new JLabel("    " + question + "    ", JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	}
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	void check() {
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect++;
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect! The correct Answer is " + correctAnswer);
		}
		nQuestions++;
	}
	
	static void showResults() {
		finishTime = new Timestamp(System.currentTimeMillis()).getTime();
		long takenTime = (finishTime - startTime) / 1000;
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + ". You spent " + takenTime + " seconds on this quiz");
	}
}
