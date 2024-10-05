package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.Date;

public class Member {

    private Date date;
    private Contact contact;
    private Group group;

    public Member(Contact contact, Group group, Date date) {
        this.contact = contact;
        this.group = group;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
