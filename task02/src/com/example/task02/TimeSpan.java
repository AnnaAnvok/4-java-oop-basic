package com.example.task02;

public class TimeSpan {
    private int Hours;
    private int Minutes;
    private int Seconds;

    public TimeSpan(int Hours, int Minutes, int Seconds) {
        this.Hours = Hours;
        this.Minutes = Minutes;
        this.Seconds = Seconds;
    }

    public int getHours() {
        return Hours;
    }

    public int getMinutes() {
        return Minutes;
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    public void setSeconds(int Seconds) {
        this.Seconds = Seconds;
    }

    public void add(TimeSpan time) {
        this.Seconds += time.Seconds;
        this.Minutes += time.Minutes + this.Seconds / 60;
        this.Seconds %= 60;
        this.Hours += time.Hours + this.Minutes / 60;
        this.Minutes %= 60;
    }

    public void subtract(TimeSpan time) {
        if (this.Seconds < time.Seconds) {
            this.Seconds += 60;
            this.Minutes--;
        }
        this.Seconds -= time.Seconds;
        if (this.Minutes < time.Minutes) {
            this.Minutes += 60;
            this.Hours--;
        }
        this.Minutes -= time.Minutes;
        this.Hours -= time.Hours;
    }

    public String toString() {
        return String.format("%d-%d-%d", this.Hours, this.Minutes, this.Seconds);
    }
}
