package com.company;

public class Main 
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
		Name name1 = new Name("Mr", "John", "Henry", "Doe");

		Person p1 = PersonFactory.setPerson(name1);
		Person p2 = PersonFactory.setPerson();

		System.out.println(p1.getName());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());

		System.out.println(p2.getName());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
=======

		Name n1 = NullName.getInstance();
		Name n2 = new Name("Mr", "John", "Henry", "Doe");

		System.out.println(n1.getName());
		System.out.println(n1.getFirst());
		System.out.println(n1.getLast());

		System.out.println(n2.getName());
		System.out.println(n2.getFirst());
		System.out.println(n2.getLast());
>>>>>>> f076d828d0df3a9ace9d9f2bec194df67bff07d0
	}
}
