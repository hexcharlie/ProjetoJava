package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
		Menu menu = new Menu();
		menu.showMenu();
	}

}
