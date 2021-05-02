package bcp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("service-a")
public class Configuration {
    
    private String role;
    private String pass;
    private Map<String, DbTenant> dbtenants = new HashMap<>();

    protected Configuration() { }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Map<String, DbTenant> getDbtenants() {
        return dbtenants;
    }

    public void setDbtenants(Map<String, DbTenant> dbtenants) {
        this.dbtenants = dbtenants;
    }

    public static class DbTenant {
        private String host;
        private Integer port;

        public String getHost() {
            return host;
        }
        public void setHost(String host) {
            this.host = host;
        }
        public Integer getPort() {
            return port;
        }
        public void setPort(Integer port) {
            this.port = port;
        }

        
    }

}