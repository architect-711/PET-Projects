package timer.machine;

public class ConvertTime {

    private int hours;
    private int minutes;
    private int seconds;

    public ConvertTime() {}

    public void convertTime(String hours, String minutes, String seconds) {
        this.hours   = hours.isEmpty()   ? 0 : Integer.parseInt(hours);
        this.minutes = minutes.isEmpty() ? 0 : Integer.parseInt(minutes);
        this.seconds = seconds.isEmpty() ? 0 : Integer.parseInt(seconds);
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
