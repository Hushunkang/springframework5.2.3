package com.atguigu.spring.beans;

public class Car {

	private String brand;
	private String company;
	private float price;
	private int maxSpeed;

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Car(String brand, String company) {
		this.brand = brand;
		this.company = company;
	}

	public Car(String brand, String company, float price) {
		this.brand = brand;
		this.company = company;
		this.price = price;
	}

	public Car(String brand, String company, int maxSpeed) {
		this.brand = brand;
		this.company = company;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", company='" + company + '\'' +
				", price=" + price +
				", maxSpeed=" + maxSpeed +
				'}';
	}

}
