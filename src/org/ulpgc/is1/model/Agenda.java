package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contact> contactList;
    private List<Group> groupList;

    public Agenda() {
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }
    public void addPerson(String telephone, String email, String firstName, String lastName, String street, int number,
                          int floor, String city) {
        Person person = new Person(telephone, email, firstName, lastName, street, number, floor, city);
        if (!contactList.contains(person)){ contactList.add(person); }
    }

    public void addCompany(String telephone, String email, String name, String description,  String street, int number,
                           int floor, String city) {
        Company company = new Company(telephone,email,name,description,street, number, floor, city);
        if (!contactList.contains(company)){ contactList.add(company); }
    }

    public void addGroup(String name) {
        Group group = new Group(name);
        if (!groupList.contains(group)){ groupList.add(group); }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

}
