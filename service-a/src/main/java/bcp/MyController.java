package bcp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bcp.Configuration.DbTenant;

@RestController
public class MyController {
    
    @Autowired
    private Configuration configuration;

    @GetMapping(value = "/whoami/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        return String.format("Hello! You're %s (%s) and you'll become a(n) %s...\n", username, configuration.getPass(), configuration.getRole());
    }

	@GetMapping("/conn/{tenant}")
	public DbTenant conn(@PathVariable(value = "tenant") String tenant) {
		return configuration.getDbtenants().get(tenant);
	}

    @GetMapping("/all")
	public Map<String, DbTenant> all() {
		return configuration.getDbtenants();
	}

}