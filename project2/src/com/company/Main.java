package com.company;

public class Main 
{
	public static void main(String[] args)
	{
		Name name1 = new Name("Mr", "John", "Henry", "Doe");

		Person p1 = PersonFactory.setPerson(name1);
		Person p2 = PersonFactory.setPerson();

		System.out.println(p1.getName());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());

		System.out.println(p2.getName());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
	}
}
