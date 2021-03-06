package anamed.config;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("anamed.entity")
@EnableJpaRepositories(basePackages = "anamed.repository")
public class SpringDataConfiguration {

}
