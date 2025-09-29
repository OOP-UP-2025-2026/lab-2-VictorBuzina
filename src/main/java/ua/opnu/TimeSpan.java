package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    // Конструктор
    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
            return;
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) return;
        int totalMinutes = this.getTotalMinutes() + hours * 60 + minutes;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    void addTimeSpan(TimeSpan timespan) {
        if (timespan == null) return;
        this.add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        if (span == null) return;
        int totalMinutes = this.getTotalMinutes() - span.getTotalMinutes();
        if (totalMinutes < 0) return;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    void scale(int factor) {
        if (factor <= 0) return;
        int totalMinutes = this.getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}
