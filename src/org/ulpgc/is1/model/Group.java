package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Group {

    private String name;

    private List<Member> contactList;

    public Group(String name) {
        this.name = name;
        this.contactList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Member> getContactList() {
        return contactList;
    }


    public void removeContact(Contact contact){
        this.contactList.remove(contact);
    }
    public void addContact(Contact contact) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        Member member = new Member(contact,this, date);
        contactList.add(member);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name);
    }

}

