package com.company;

public class RealPerson extends Person {
    public RealPerson(Name name)
    {
        setName(name);
    }

    @Override
    public void setName(Name name) {
        mName = name;
    }

    @Override
    public String getName() {
        if(mName != null)
        {
            return getTitle() + " " + getFirstName() + " " + getMiddleName() + " " + getLastName();
        }
        else
        {
            return "This person has no name";
        }
    }

    @Override
    public String getFirstName() {
        if(mName != null) return mName.getFirst();
        else return "This person has no first name";
    }

    @Override
    public String getMiddleName() {
        if(mName != null) return mName.getMiddle();
        else return "This person has no middle name";
    }

    @Override
    public String getLastName() {
        if(mName != null) return mName.getLast();
        else return "This person has no last name";
    }

    @Override
    public String getTitle() {
        if(mName != null) return mName.getTitle();
        else return "This person has no title";
    }
}
