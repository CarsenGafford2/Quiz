/**
 * JButton for dealing with right and wrong answers and displaying text
 * @author Carsen Gafford
 * @version 1.1
 */

import javax.swing.JButton;

public class AnswerButton extends JButton {
    private boolean Correct;

    /**
     * Constructor for the AnswerButton Object
     * @author Carsen Gafford
     * @param Correct Is this the correct answer
     */
    public AnswerButton(boolean Correct) {
        this.Correct = Correct;
    }
    /**
     * Constructor for the AnswerButton Object
     * @author Carsen Gafford
     * @param Correct Is this the correct answer
     * @param startingText Starting text within the button
     */
    public AnswerButton(boolean Correct, String startingText) {
        this.Correct = Correct;
        this.setText(startingText);
    }

    /**
     * Method for checking if the button is the correct answer
     * @author Carsen Gafford
     * @return boolean whether this was the correct answer or not
     */
    public boolean isCorrect() {
        return this.Correct;
    }

    /**
     * Method for setting a button as the correct answer or as the incorrect answer
     * @author Carsen Gafford
     * @param correct boolean determining if the button is correct or not
     */
    public void setCorrect(boolean correct) {
        this.Correct = correct;
    }
}
