import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;


public class QuizPanel extends JPanel {
    private AnswerButton[] buttons = new AnswerButton[4];
    public QuizPanel() {
        setLayout(new GridLayout(2, 2));

        for (int x = 0; x < buttons.length; x++) {
            buttons[x]  = new AnswerButton(false);
            buttons[x].setPreferredSize(new Dimension(500, 300));
            buttons[x].setBackground(Color.CYAN);
            add(buttons[x]);

        }
    }
}
