package org.ulpgc.is1.model;

public class Person extends Contact{

    private String firstName;
    private String lastName;

    public Person(String telephone, String email, Address address, String firstName, String lastName) {
        super(telephone, email, address);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

}
