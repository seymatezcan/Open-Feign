package emlakBurada5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmlakBurada5Application {

	public static void main(String[] args) {
		SpringApplication.run(EmlakBurada5Application.class, args);
	}

}
