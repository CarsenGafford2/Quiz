import javax.swing.JLabel;

public class QuestionLabel extends JLabel {
    
    public QuestionLabel(String startingText) {
        this.setText(startingText);
    }

    public void makeText(String text) {
        this.setText(text);
    }
}
