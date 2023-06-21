package timer.machine;

import timer.notification.WindowsNotification;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    private JTextField hoursField;
    private JTextField minutesField;
    private JTextField secondsField;
    private JLabel timeLeft;
    private ConvertTime convertTime;
    private int secondsTime = 0;
    private Timer timer;

    public CountdownTimer(JTextField hoursField, JTextField minutesField, JTextField secondsField, JLabel timeLeft) {
        this.hoursField = hoursField;
        this.minutesField = minutesField;
        this.secondsField = secondsField;
        this.timeLeft = timeLeft;
    }

    public void startTimer() {
        if (secondsTime == 0)
            defineSecondsTime();

        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                decrementTime();
            }
        }, 1000, 1000);
    }

    public void resetTimer() {
        timeLeft.setText("00:00:00");

        secondsTime = 0;
        timer.cancel();
        timer.purge();
    }

    public void pauseTimer() {
        timer.cancel();
        timer.purge();
    }




    private void defineSecondsTime() {
        convertTime = new ConvertTime();

        convertTime.convertTime(hoursField.getText(), minutesField.getText(), secondsField.getText());

        secondsTime = (convertTime.getHours() * 60 * 60) + (convertTime.getMinutes() * 60) + convertTime.getSeconds();
    }

    private void showTime() {
        PrettyTime prettyTime = new PrettyTime(secondsTime);

        timeLeft.setText(prettyTime.getPrettyTime());
    }

    private void decrementTime() {
        if (secondsTime == 0) {
            resetTimer();
            sendNotification();
        }

        showTime();

        --secondsTime;
    }

    public void sendNotification() {
        WindowsNotification windowsNotification = new WindowsNotification("Time left", "Your timer: " + convertTime.getHours() + ":" + convertTime.getMinutes() + ":" + convertTime.getSeconds() + " is up!");

        windowsNotification.sendNotification();
    }

    private void resetTime() {
        secondsTime = 0;
    }
}
