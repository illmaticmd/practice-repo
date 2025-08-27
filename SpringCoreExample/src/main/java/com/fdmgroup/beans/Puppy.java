package com.fdmgroup.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("genericPuppy")
@Scope("prototype")
public class Puppy {
	private String texture;
	private int age;
	private double mass;
	private String name;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Puppy() {
		super();
	}

	public Puppy(String texture, int age, double mass, String name, String type) {
		super();
		this.texture = texture;
		this.age = age;
		this.mass = mass;
		this.name = name;
		this.type = type;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Puppy [texture=" + texture + ", age=" + age + ", mass=" + mass + ", name=" + name + "]";
	}

}
