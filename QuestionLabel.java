import javax.swing.JLabel;

public class QuestionLabel extends JLabel {
    
    private String text;
    public QuestionLabel(String startingText) {
        this.text = startingText;
    }

    public void makeText(String text) {
        this.setText(text);
    }
}
