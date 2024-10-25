import javax.swing.JButton;

public class AnswerButton extends JButton {
    private boolean Correct;

    public AnswerButton(boolean Correct) {
        this.Correct = Correct;
    }

    public boolean isCorrect() {
        return this.Correct;
    }
}
