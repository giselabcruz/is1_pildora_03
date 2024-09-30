package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public Contact(String telephone, String email, Address address) {
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public abstract String getName();
}
