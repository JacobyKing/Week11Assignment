package dmacc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHousesFormValidationApplication /*implements CommandLineRunner*/{
	public static void main(String[] args) {
		SpringApplication.run(SpringHousesFormValidationApplication.class, args);
	}
	/*@Autowired
	HouseRepository repo;
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);	
		House h = appContext.getBean("house", House.class);
		repo.save(h);
		List<House> allMyHouses = repo.findAll();
		for(House house: allMyHouses) {
			System.out.println(house.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}*/
}
