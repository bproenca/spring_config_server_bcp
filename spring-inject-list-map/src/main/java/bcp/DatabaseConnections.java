package bcp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("dbcon")
public class DatabaseConnections {
    private Map<String, Tenant> tenants = new HashMap<>();

    public Map<String, Tenant> getTenants() {
        return tenants;
    }

    public static class Tenant {
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