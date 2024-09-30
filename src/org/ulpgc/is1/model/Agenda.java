package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contact> contactList;
    private ArrayList<Group> groupList;

    public Agenda() {
        contactList = new ArrayList<>();
        groupList = new ArrayList<>();
    }
    public void addPerson(String telephone, String email, Address address, String firstName, String lastName) {
        Person person = new Person(telephone, email, address, firstName, lastName);
        contactList.add(person);
    }

    public void addCompany(String telephone, String email, Address address, String name, String description) {
        Company company = new Company(telephone,email, address,name,description);
        contactList.add(company);
    }


    public void addGroup(String name) {
        groupList.add(new Group(name));
    }

    public void addContactToGroup(String groupName, Contact contact) {
        for (Group group : groupList) {
            if (group.getName().equals(groupName)) {
                group.addContact(contact);
                return;
            }
        }
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public ArrayList<Group> getGroupList() {
        return groupList;
    }

}
