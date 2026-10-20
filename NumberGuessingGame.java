package classworks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGame extends JFrame implements ActionListener {
    private int targetNumber;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel promptLabel;
    private JLabel feedbackLabel;

    public NumberGuessingGame() {
        
        generateNewNumber();

        
        setTitle("Number Guessing Game");
        setSize(380, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        
        promptLabel = new JLabel("Guess a number between 1 and 100:", SwingConstants.CENTER);
        promptLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(promptLabel, BorderLayout.NORTH);

        
        JPanel inputPanel = new JPanel(new FlowLayout());
        guessField = new JTextField(10);
        guessField.setFont(new Font("Arial", Font.PLAIN, 14));
        guessButton = new JButton("Guess");
        guessButton.setFont(new Font("Arial", Font.BOLD, 13));

        guessButton.addActionListener(this);
        guessField.addActionListener(this); 

        inputPanel.add(guessField);
        inputPanel.add(guessButton);
        add(inputPanel, BorderLayout.CENTER);

      
        feedbackLabel = new JLabel("Enter a number and click Guess", SwingConstants.CENTER);
        feedbackLabel.setFont(new Font("Arial", Font.BOLD, 13));
        add(feedbackLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void generateNewNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = guessField.getText().trim();

        try {
            int guess = Integer.parseInt(input);

           
            if (guess < 1 || guess > 100) {
                feedbackLabel.setText("Please enter a valid number between 1 and 100.");
                return;
            }

           
            if (guess > targetNumber) {
                feedbackLabel.setText("Too high! Try again. Random number: " + targetNumber);
            } else if (guess < targetNumber) {
                feedbackLabel.setText("Too low! Try again. Random number: " + targetNumber);
            } else {
                feedbackLabel.setText("Correct! Random number was: " + targetNumber);
                
                generateNewNumber();
            }

        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Invalid input! Please enter an integer.");
        } finally {
            guessField.selectAll();
            guessField.requestFocus();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NumberGuessingGame());
    }
}
