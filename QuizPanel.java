import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuizPanel extends JPanel {
    private AnswerButton[] buttons = new AnswerButton[4];
    private JLabel label;
    private int memoryIndex = 0;
    private int correct = 0;
    private int incorrect = 0;
    private JFrame frame;
    public QuizPanel(JLabel label, JFrame frame) {
        this.label = label;
        this.frame = frame;
        try {
            File file = new File("Test.txt");
            Scanner scan = new Scanner(file);

            this.label.setText(scan.nextLine());

            setLayout(new GridLayout(2, 2));

            for (int x = 0; x < buttons.length; x++) {
                String text = scan.nextLine();
                System.out.println(text);
                if (text.charAt(0) == 'T') {
                    buttons[x]  = new AnswerButton(true, "" + text.substring(1));
                } else {
                    buttons[x]  = new AnswerButton(false, "" + text.substring(1));
                }
                buttons[x].setPreferredSize(new Dimension(500, 300));
                // buttons[x].setBackground(Color.CYAN); --Needed for testing
                buttons[x].addActionListener(new AnswerButtonListener());
                add(buttons[x]);
    
            }
            scan.close();
            this.memoryIndex++;
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    private void nextQuestion() {
        try {
            File file = new File("Test.txt");
            Scanner scan = new Scanner(file);
            for (int x = 0; x < this.memoryIndex*5; x++) {
                scan.nextLine();
            }
            if (scan.hasNextLine()) {
                this.label.setText(scan.nextLine());

                for (int x = 0; x < buttons.length; x++) {
                    String text = scan.nextLine();
                    System.out.println(text);
                    if (text.charAt(0) == 'T') {
                        buttons[x].setText(text.substring(1));
                        buttons[x].setCorrect(true);
                    } else {
                        buttons[x].setText(text.substring(1));
                        buttons[x].setCorrect(false);
                   }    
                }
                this.memoryIndex++;

                revalidate();
                repaint();
            } else {
                GameOver();
            }
            scan.close();
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    private void GameOver() {
        JOptionPane.showMessageDialog(null, "You got: " + correct + "/" + (incorrect + correct), "Game over", JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }

    private class AnswerButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            AnswerButton button = (AnswerButton) e.getSource();

            if(button.isCorrect()) {
                System.out.println("Correct");
                QuizPanel.this.correct++;
                nextQuestion();
            } else {
                QuizPanel.this.incorrect++;
                System.out.println("Incorrect");
                nextQuestion();
            }
        }
    }
}
