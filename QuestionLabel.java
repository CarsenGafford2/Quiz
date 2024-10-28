/**
 * JLabel for displaying the question
 * @author Carsen Gafford
 * @version 1.0
 */

import javax.swing.JLabel;

public class QuestionLabel extends JLabel {

    /**
     * QuestionLabel Constructor
     * @param startingText The starting Text of the QuestionLabel
     */
    public QuestionLabel(String startingText) {
        this.setText(startingText);
    }
}
