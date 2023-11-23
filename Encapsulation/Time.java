package Encapsulation;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public boolean check(int hour, int minute, int second) {
        if (hour > 23 || hour < 0 || minute > 59 || minute < 0 || second > 59 || second < 0) {
            return false;
        } else {
            return true;
        }
    }

    public Time(int hour, int minute, int second) {
        if (check(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("error");
        }
    }

    public int getHour() {
        if(this.hour == 24){
            this.hour = 0;
        }
        return hour;
    }

    public void setHour(int hour) {
        if (check(hour, this.minute, this.second)) {
            this.hour = hour;

        } else {
            System.out.println("error");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (check(this.hour, minute, this.second)) {
            this.minute = minute;

        } else {
            System.out.println("error");
        }

    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (check(this.hour, this.minute, second)) {
            this.second = second;
        } else {
            System.out.println("error");
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (check(hour, minute, second)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("error");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
    }

    public Time nextSecond() {
        this.second++;
        if(second > 59){
            second = 0;
            minute += 1;
            if(minute > 59){
                minute = 0;
                hour +=1;
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond() {
        this.second--;
        if(second < 0){
            second = 59;
            minute -= 1;
            if(minute < 0){
                minute = 59;
                hour -=1;
                if(hour < 0){
                    hour = 23;
                }
                if(hour == 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
