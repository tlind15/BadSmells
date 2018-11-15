package com.company;

public class NullPerson extends Person {
    @Override
    public void setName(Name name) {

    }

    @Override
    public String getName() {
        return "Person Does Not Exist";
    }

    @Override
    public String getFirstName() {
        return "Person Does Not Exist";
    }

    @Override
    public String getMiddleName() {
        return "Person Does Not Exist";
    }

    @Override
    public String getLastName() {
        return "Person Does Not Exist";
    }

    @Override
    public String getTitle() {
        return "Person Does Not Exist";
    }
}
