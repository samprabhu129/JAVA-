package com.cognizant.shapes;

public class Circle {
    public float radius;
    public float pi;

    // Default Constructor
    public Circle() {
        this.radius = 1.5f;
        this.pi = 3.5f;
    }

    // Constructor1
    public Circle(float radius) {
        this.radius = radius;
        this.pi = 3.5f;
    }
    //constructor 2
    public Circle(float radius,float pi) {
    	this.radius=radius;
    	this.pi=pi;
    }

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}
	public float calculateCircleArea(float radius) {
        return pi * radius * radius;
    }

    public float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }
    public static void main(String[] args) {
        Circle ce = new Circle(2.5f, 3.5f);

        float area = ce.calculateCircleArea(ce.getRadius());
        float circumference = ce.calculateCircumference(ce.getRadius());

        System.out.println("Circle with radius " + ce.getRadius() + " and pi " + ce.getPi() +
                " has area " + area + " and circumference " + circumference);
    }
    
}
