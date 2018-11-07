package com.company;

public class Main 
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person();
	
		Name name = new Name("Mr", "John", "Henry", "Doe");
		p2.setName(name);
		
		System.out.println(p1.getName());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		
		System.out.println(p2.getName());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
	}
}
