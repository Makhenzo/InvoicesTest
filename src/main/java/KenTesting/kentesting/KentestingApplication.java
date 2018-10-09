package KenTesting.kentesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication


@EntityScan("entitys")
@EnableJpaRepositories("methods")
public class KentestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(KentestingApplication.class, args);
	}
}
