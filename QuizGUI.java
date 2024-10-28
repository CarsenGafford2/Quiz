import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class QuizGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            file = args[0];
        }
        frame.setLayout(new BorderLayout());

        JMenuBar menu = new JMenuBar();

        JPanel uploadPanel = new JPanel();
        uploadPanel.setPreferredSize(new Dimension(1000, 600));
        uploadPanel.setLayout(new FlowLayout());

        JLabel instructionLabel = new JLabel("Click the button to upload a correctly formated .txt file:");
        instructionLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 18));
        uploadPanel.add(instructionLabel);

        JButton uploadButton = new JButton("Upload File");
        uploadPanel.add(uploadButton);

        menu.add(uploadPanel);
        frame.setJMenuBar(menu);

        JLabel questionLabel = new JLabel("Which is correct?");
        questionLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 25));
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        questionLabel.setVisible(false);
        
        frame.getContentPane().add(questionLabel, BorderLayout.NORTH);

        QuizPanel quizPanel = new QuizPanel(questionLabel, frame, null);
        quizPanel.setVisible(false);
        frame.getContentPane().add(quizPanel, BorderLayout.CENTER);

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(frame);
                int lines = 0;
                String[] text = new String[5];
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try {
                        Scanner scan = new Scanner(selectedFile);
                        while(scan.hasNextLine()){
                            if (lines <= 5) {
                                text[lines] = scan.nextLine();
                            } else {
                                scan.nextLine();
                            }
                            lines++;
                        }
                        scan.close();
                    } catch(Exception q) {
                        System.err.println(q);
                    }
                    if (lines % 5 == 0 && lines > 0 && text[1].charAt(0) == 'T'|| text[1].charAt(0) == 'F' && text[2].charAt(0) == 'T'|| text[2].charAt(0) == 'F' && text[3].charAt(0) == 'T'|| text[3].charAt(0) == 'F' && text[4].charAt(0) == 'T'|| text[4].charAt(0) == 'F') {
                        System.out.println("Selected file: " + selectedFile.getAbsolutePath());
                    
                        quizPanel.setVisible(true);
                        questionLabel.setVisible(true);
                        uploadPanel.setVisible(false);
                        quizPanel.setFile(selectedFile);
                        quizPanel.nextQuestion();
                        frame.revalidate();
                        frame.repaint();
                    } else {
                        JOptionPane.showMessageDialog(null, "File: " + selectedFile.getAbsolutePath() + " is not formatted correctly", "Error", JOptionPane.ERROR_MESSAGE);
                        selectedFile = null;
                    }
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }
}