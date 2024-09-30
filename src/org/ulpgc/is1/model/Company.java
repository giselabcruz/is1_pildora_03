package org.ulpgc.is1.model;

public class Company extends Contact {
    private String name;
    private String description;

    public Company(String telephone, String email, Address address, String name, String description) {
        super(telephone, email, address);
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

}
