public class Lab3Q1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(11, 12, 13);
        Time time3 = new Time(1, 1, 3);

        time2.displayTime();
        time1.addTime(time2, time3);
        time1.displayTime();
        time2.subtractTime(time1, time3);
        time2.displayTime();

        System.out.println("Time 1 in seconds: " + time1.toSecond());
        System.out.println("Time 2 in hour: " + time2.toHour());
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    // default constructor
    Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // constructor
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // display time method HH:MM:SS
    void displayTime() {
        if (hour < 10) {
            System.out.print("0" + hour + ":");
        } else {
            System.out.print(hour + ":");
        }
        if (minute < 10) {
            System.out.print("0" + minute + ":");
        } else {
            System.out.print(minute + ":");
        }
        if (second < 10) {
            System.out.print("0" + second);
        } else {
            System.out.print(second);
        }
    }

    // set time method
    void setTime(byte hour, byte minute, byte second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // formate time
    private void formatTime(int second) {
        this.setTime((byte) 0, (byte) 0, (byte) 0);
        if (second < 60) {
            this.second = second;
        } else if (second < 3600) {
            this.minute = second / 60;
            this.second = second % 60;
        } else {
            this.hour = second / 3600;
            this.minute = (second % 3600) / 60;
            this.second = (second % 3600) % 60;
        }
    }

    // add time method
    void addTime(Time a, Time b) {
        int totalSecond = a.toSecond() + b.toSecond();
        this.formatTime(totalSecond);
    }

    // subtract time method
    void subtractTime(Time a, Time b) {
        int totalSecond = a.toSecond() - b.toSecond();
        this.formatTime(Math.abs(totalSecond));
    }

    // toSecond method converts time to seconds
    int toSecond() {
        return hour * 3600 + minute * 60 + second;
    }

    // toHour method converts time to hours
    int toHour() {
        return hour;
    }
}