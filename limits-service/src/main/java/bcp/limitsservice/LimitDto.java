package bcp.limitsservice;

import java.time.LocalDateTime;

public class LimitDto {
    private int minimum;
    private int maximum;
    private String myprofile;
    private LocalDateTime time;
    private String message;


    public LimitDto(Configuration conf, LocalDateTime time, String message) {
        this.minimum = conf.getMinimum();
        this.maximum = conf.getMaximum();
        this.myprofile = conf.getMyprofile();
        this.time = time;
        this.message = message;
    }

    /**
     * @return the minimum
     */
    public int getMinimum() {
        return minimum;
    }

    /**
     * @return the maximum
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * @param maximum the maximum to set
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    /**
     * @param minimum the minimum to set
     */
    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMyprofile() {
        return myprofile;
    }

    public void setMyprofile(String myprofile) {
        this.myprofile = myprofile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LimitDto [maximum=" + maximum + ", message=" + message + ", minimum=" + minimum + ", myprofile="
                + myprofile + ", time=" + time + "]";
    }

}