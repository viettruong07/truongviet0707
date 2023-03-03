package Session06;

public class Time {
    private int second, minute, hour;

    public Time(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time(){
        this.second = 0;
        this.minute = 0;
        this.hour = 0;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute,second);
    }
    public void setTime(int second, int minute, int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public Time nextSecond(){
        ++second;
        if (second >= 60){
            second = 0;
            ++minute;
            if (minute >= 60){
                minute = 0;
                ++hour;
                if(hour >= 24){
                    hour = 0;
                }
            }
        }
        return this;
    }
}
