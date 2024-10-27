import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizPanel extends JPanel {
    private AnswerButton[] buttons = new AnswerButton[4];
    public QuizPanel() {
        setLayout(new GridLayout(2, 2));

        for (int x = 0; x < buttons.length; x++) {
            buttons[x]  = new AnswerButton(true, "" + x);
            buttons[x].setPreferredSize(new Dimension(500, 300));
            buttons[x].setBackground(Color.CYAN);
            buttons[x].addActionListener(new AnswerButtonListener());
            add(buttons[x]);

        }
    }

    private class AnswerButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            AnswerButton button = (AnswerButton) e.getSource();

            if(button.isCorrect()) {
                System.out.println("Correct");
            }
        }
    }
}
