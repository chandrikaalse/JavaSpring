package slk.com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import slk.com.HTMLInfoWriter;
import slk.com.InformationWriter;
import slk.com.Student;

@ Configuration
public class AppConfig {
	
	@Bean
	public InformationWriter informationWriter() {
		return new HTMLInfoWriter();
	}
	
	@Bean
	public Student StdInfo() {
		Student std = new Student();
		std.setName("Chandrika");
		std.setEmail("alse.chandrika@gmail.com");
		std.setRegNo(10);
		
		return std;
	}
	
	
	
}
