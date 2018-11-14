package com.company;

public class Main 
{
	public static void main(String[] args)
	{

		Name n1 = NullName.getInstance();
		Name n2 = new Name("Mr", "John", "Henry", "Doe");

		System.out.println(n1.getName());
		System.out.println(n1.getFirst());
		System.out.println(n1.getLast());

		System.out.println(n2.getName());
		System.out.println(n2.getFirst());
		System.out.println(n2.getLast());
	}
}
