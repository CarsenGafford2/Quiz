import javax.swing.*;
import java.awt.*;

public class QuizGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new QuizPanel());

        // Create the menu bar
        JMenuBar menu = new JMenuBar();
        
        // Create a panel to center the label
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JLabel questionLabel = new JLabel("Which is correct?");
        questionLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 25));
        centerPanel.add(questionLabel);
        
        menu.add(centerPanel);
        
        frame.setJMenuBar(menu);
        
        frame.pack();
        frame.setVisible(true);
    }
}