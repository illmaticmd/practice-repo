package com.fdmgroup.beans;

import java.text.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // finding any annotation in this class and
public class SpringAnnotationMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringAnnotationMain.class);

		Shelter shelter = context.getBean(Shelter.class);
		System.out.println(shelter);
		Puppy genPuppy = context.getBean("genericPuppy", Puppy.class);
		context.close();

	}

	@Bean
	public String name1() {
		return "Tehrrih";

	}

	@Bean // creates bean - monitors object returned from the method and registers it as
			// it comes out
	public Puppy shihTzu(String name1) {
		Puppy puppy = new Puppy();
		puppy.setAge(1);
		puppy.setMass(1.0);
		puppy.setName("Tehrrih");
		puppy.setTexture("Silky floof");
		return puppy;
	}

	@Bean
	public Puppy chowChow(String name1) {
		return new Puppy("Mega floof", 2, 300, "Fluffington the Third");
	}

	@Bean
	public Shelter shelter(List<Puppy> puppies) {
		return new Shelter(puppies);
	}
}
