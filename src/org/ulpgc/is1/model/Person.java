package org.ulpgc.is1.model;

public class Person extends Contact{

    private String firstName;
    private String lastName;

    public Person(String telephone, String email,  String firstName, String lastName, String street,
                  int number, int floor, String city) {
        super(telephone, email, street, number, floor, city);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

}
