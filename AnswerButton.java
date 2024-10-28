import javax.swing.JButton;

public class AnswerButton extends JButton {
    private boolean Correct;

    public AnswerButton(boolean Correct) {
        this.Correct = Correct;
    }
    public AnswerButton(boolean Correct, String startingText) {
        this.Correct = Correct;
        this.setText(startingText);
    }

    public boolean isCorrect() {
        return this.Correct;
    }
    public void setCorrect(boolean correct) {
        this.Correct = correct;
    }
    public void makeText(String text) {
        this.setText(text);
    }
}
