package red.niki.criticcouch;

import org.springframework.boot.SpringApplication;//contains a method run
import org.springframework.boot.autoconfigure.SpringBootApplication;//to import annotations. annotations in java are used to let the program know what needs to be done
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class CriticcouchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriticcouchApplication.class, args);
	}


}
