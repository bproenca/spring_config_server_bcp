package bcp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bcp.DatabaseConnections.Tenant;

@RestController
public class MyController {

    @Autowired
    private DatabaseConnections connections;

	@GetMapping("/conn/{tenant}")
	public Tenant conn(@PathVariable(value = "tenant") String tenant) {
		return connections.getTenants().get(tenant);
	}

    @GetMapping("/all")
	public Map<String, Tenant> all() {
		return connections.getTenants();
	}
}