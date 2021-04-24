package bcp.configserverbcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerBcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerBcpApplication.class, args);
	}

}
