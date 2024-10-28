import javax.swing.*;
import java.awt.*;

public class QuizGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String file = "";
        if (args.length > 0) {
            file = args[0];
        }

        // Create the menu bar
        JMenuBar menu = new JMenuBar();
        
        // Create a panel to center the label
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel questionLabel = new JLabel("Which is correct?");
        questionLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 25));
        centerPanel.add(questionLabel);
        
        menu.add(centerPanel);
        frame.getContentPane().add(new QuizPanel(questionLabel, frame, file));
        
        frame.setJMenuBar(menu);
        
        frame.pack();
        frame.setVisible(true);
    }
}