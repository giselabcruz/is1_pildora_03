package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;

    private List<Contact> contactList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Contact> getContactList() {
        return contactList;
    }


    public void removeContact(Contact contact){
        this.contactList.remove(contact);
    }
    public void addContact(Contact contact) {
        contactList.add(contact);
        }
    }

