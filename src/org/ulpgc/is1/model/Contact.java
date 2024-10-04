package org.ulpgc.is1.model;

public abstract class Contact {
    private String telephone;
    private String email;
    private Address address;

    public Contact(String telephone, String email, String street, int number, int floor, String city) {
        this.telephone = telephone;
        this.email = email;
        this.address = new Address(street, number, floor, city);
    }

    public abstract String getName();

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public String getEmail() {
        return this.email;
    }
}
