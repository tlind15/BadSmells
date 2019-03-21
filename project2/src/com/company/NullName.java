package com.company;

public class NullName extends Name {

    static NullName sNullName;

    static NullName getInstance() {
        if(sNullName == null) {
            sNullName = new NullName();
        }
        return sNullName;
    }

    private NullName() {
        super(
                "This person has no title",
                "This person has no first name",
                "This person has no middle name",
                "This person has no last name"
        );
    }

    @Override
    public String getName() {
        return "This person has no name";
    }
}
