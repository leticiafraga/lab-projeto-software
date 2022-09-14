package LeticiaRichbertSara.LabDesSoftware02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LabDesSoftware02Application {

	public static void main(String[] args) {
		SpringApplication.run(LabDesSoftware02Application.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "othername", defaultValue = "World²") String othername) {
		return String.format("Hello %s %s!", name, othername);
	}
}
