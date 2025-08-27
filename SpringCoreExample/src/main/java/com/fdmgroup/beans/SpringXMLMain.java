package com.fdmgroup.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		Shelter shelter = context.getBean(Shelter.class);
		Puppy puppy = context.getBean("genericPuppy", Puppy.class);
		puppy.setAge(135);
		puppy.setMass(50);
		puppy.setName("Pongo");
		puppy.setType("dalmatian");
		puppy.setTexture("beam me up, spotty!");

		shelter.receievePuppy(puppy);
		System.out.println(shelter);

		shelter.setCruella(context.getBean(Cruella.class));
		puppy = context.getBean("genericPuppy", Puppy.class);
		puppy.setAge(135);
		puppy.setMass(50);
		puppy.setName("Pongo");
		puppy.setType("dalmatian");
		puppy.setTexture("beam me up, spotty!");

		shelter.receievePuppy(puppy);
		System.out.println(shelter);

	}

}
