package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
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
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        Member member = new Member(contact,this, date);
        contactList.add(contact);
        }
    }

