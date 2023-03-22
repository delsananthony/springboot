package net.javaguides.springbootbackend;

import net.javaguides.springbootbackend.models.Employee;
import net.javaguides.springbootbackend.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee();
//		employee.setFirstName("John");
//		employee.setLastName("Doe");
//		employee.setEmailId("info@johndoe.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("Doe");
//		employee1.setEmailId("info@johndoe.com");
//		employeeRepository.save(employee1);

	}
}
