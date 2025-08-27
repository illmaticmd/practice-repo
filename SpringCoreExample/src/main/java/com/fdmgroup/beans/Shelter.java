package com.fdmgroup.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shelter {
	@Autowired // include @Required annotation. @Autowired can be applied directly to fields
	// some say it should be only used on constructors and setters
	// tying it to fields makes it committed to or coupled to Spring
	private List<Puppy> puppies;

	// @Qualifier("specificName") to specify specifically named beings

	@Resource // similar to Autowired
	private Cruella cruella;
	private List<Puppy> cellar = new ArrayList<>();

	public Shelter(List<Puppy> puppies) {
		// super();
		this.puppies = puppies;
	}

	public List<Puppy> getPuppies() {
		return puppies;
	}

	public void receievePuppy(Puppy puppy) {
		if (puppy.getType().equalsIgnoreCase("dalmatian") && cruella != null) {
			cellar.add(puppy);
			for (Puppy puppyInShelter : puppies) {
				if (puppyInShelter.getType().equalsIgnoreCase("dalmatian")) {
					cellar.add(puppyInShelter);
				}
			}
			for (Puppy puppyInCellar : cellar) {
				puppies.remove(puppyInCellar);
			}
		} else {
			puppies.add(puppy);
		}
	}

	@Override
	public String toString() {
		return "Shelter [puppies=" + puppies + "]";
	}

	public Puppy adoptFirstPuppy() {
		Puppy puppy = puppies.get(0);
		puppies.remove(0);
		System.out.println("Hurry! Happy  puppy " + puppy);
		return puppy;
	}

	@PostConstruct
	private void advertiseShelter() {
		System.out.println("Summon Sarah mclaughlin! Puppies must go!");

	}

	public Cruella getCruella() {
		return cruella;
	}

	public void setCruella(Cruella cruella) {
		this.cruella = cruella;
	}

}
