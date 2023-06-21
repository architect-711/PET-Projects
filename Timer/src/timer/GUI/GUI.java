package timer.GUI;

import timer.machine.CountdownTimer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton startButton;
    private JPanel panel;
    private JTextField hoursField;
    private JTextField minutesField;
    private JTextField secondsField;
    private JButton stopButton;
    private JButton resetButton;
    private JLabel timeLeft;

    public GUI() {
        CountdownTimer countdownTimer = new CountdownTimer(hoursField, minutesField, secondsField, timeLeft);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countdownTimer.startTimer();

                startButton.setEnabled(false);
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countdownTimer.pauseTimer();

                startButton.setText("Continue");
                startButton.setEnabled(true);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countdownTimer.resetTimer();

                startButton.setText("Start");
                startButton.setEnabled(true);

                clearFields();
            }
        });
    }

    private void clearFields() {
        hoursField.setText("");
        minutesField.setText("");
        secondsField.setText("");
    }

    private void drawWindow(GUI gui) {
        gui.setContentPane(gui.panel);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setTitle("Architect Timer");
        gui.pack();
        gui.setVisible(true);
    }


    public void startGUI() {
        GUI timerWindow = new GUI();

        drawWindow(timerWindow);
    }
}
