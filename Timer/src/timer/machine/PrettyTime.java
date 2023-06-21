package timer.machine;

public class PrettyTime {

    private int secondsTime;
    private int hours;
    private int minutes;
    private int seconds;

    public PrettyTime(int secondsTime) {
        this.secondsTime = secondsTime;
    }


    public String getPrettyTime() {
        defineTimeLimit();

        return formatTime();
    }

    private void defineTimeLimit() {
        int howMuchHours = secondsTime / 3600;
        int howMuchMinutes = secondsTime / 60;
        int howMuchSeconds = secondsTime % 60;


        hours = howMuchHours > 0 ? howMuchHours : 0;

        if (howMuchHours > 0)
            minutes = howMuchMinutes > 0 ? (secondsTime - 3600) / 60 : 0;
        else
            minutes = secondsTime / 60;

        seconds = howMuchSeconds > 0 ? howMuchSeconds : 0;
    }

    private String formatTime() {
        String hours   = this.hours   > 9 ? String.valueOf(this.hours)   : "0" + this.hours;
        String minutes = this.minutes > 9 ? String.valueOf(this.minutes) : "0" + this.minutes;
        String seconds = this.seconds > 9 ? String.valueOf(this.seconds) : "0" + this.seconds;

        return String.format("%s:%s:%s\n", hours, minutes, seconds);
    }


    public int getSecondsTime() {
        return secondsTime;
    }

    public void setSecondsTime(int secondsTime) {
        this.secondsTime = secondsTime;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

}
