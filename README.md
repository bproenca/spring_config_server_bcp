# Getting Started


rabbit-mq
```
docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

config-server
```
export SSH_KEY_BCP=$(< ~/.ssh/bproenca_github_deploy_key_id_rsa)
mvn spring-boot:run
```

limits-service
```
mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8084 --spring.profiles.active=dev"
mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8085 --spring.profiles.active=qa"
```

Change properties:  
`git@git.synchro.com.br:BCP/bcp_config_repo.git`
* Commit
* Push
```
http -b http://localhost:8084/limits
http -b http://localhost:8085/limits

http POST http://localhost:8085/actuator/busrefresh

http -b http://localhost:8084/limits
http -b http://localhost:8085/limits
 ```

 Related links:
 * https://www.baeldung.com/spring-cloud-configuration
 * https://www.baeldung.com/spring-cloud-bus
 * https://spring.io/guides/gs/centralized-configuration/
 * https://medium.com/swlh/spring-cloud-config-bus-auto-refresh-properties-for-clients-d18fa4c036cb
 * https://cloud.spring.io/spring-cloud-config/reference/html/#_quick_start