package bcp.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    
    private int minimum;
    private int maximum;
    private String myprofile;

    protected Configuration() { }
    
    public int getMinimum() {
        return this.minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
    
    public int getMaximum() {
        return this.maximum;
    }
    
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public String getMyprofile() {
        return myprofile;
    }

    public void setMyprofile(String myprofile) {
        this.myprofile = myprofile;
    }

    @Override
    public String toString() {
        return "Configuration [maximum=" + maximum + ", minimum=" + minimum + ", myprofile=" + myprofile + "]";
    }
    
}