package rva;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendRva6Application {

	public static void main(String[] args) {
		SpringApplication.run(BackendRva6Application.class, args);
	}
	
	//funkcionalni interfejs
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		CommandLineRunner lambda = (args) -> {
			System.out.println("Beans provided by Spring Framework");
			String[] beanNames = context.getBeanDefinitionNames();
			for(String beanName: beanNames){
				System.out.println(beanName);
			}
		};
		return lambda;
	}
}
