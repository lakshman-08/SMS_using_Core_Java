package com.sms;

public class Student {
	String name;
	int age;
	Student(String name, int age) {
	this.name = name;
	this.age = age;
	}
	void displayStudent() {
	System.out.println("Name: " + name + ", Age: " + age);
	}
}
