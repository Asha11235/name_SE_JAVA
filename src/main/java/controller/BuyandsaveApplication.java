package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.config.java.ServiceScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("repository")
@EntityScan("entity")
@ComponentScan(basePackages = {"controller", "service"})
@EnableTransactionManagement
public class BuyandsaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyandsaveApplication.class, args);
	}
}
