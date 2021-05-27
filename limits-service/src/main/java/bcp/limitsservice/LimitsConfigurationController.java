package bcp.limitsservice;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
//Allow to refresh config properties
//Need to enable "actuator/refresh" endpoint (bootstrap.properties)
//management.endpoints.web.exposure.include=health,env,refresh
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitDto retrieveLimitisFromConfiguration() {
        return new LimitDto(configuration, LocalDateTime.now(), message);
    }

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
