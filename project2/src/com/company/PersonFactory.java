package com.company;

public class PersonFactory {
    public static Person setPerson(Name name){
        return new RealPerson(name);
    }
    public static Person setPerson(){
        return new NullPerson();
    }
}
