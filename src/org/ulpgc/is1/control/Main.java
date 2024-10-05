package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;
import org.ulpgc.is1.model.Member;

import java.text.SimpleDateFormat;

public class Main {
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        agenda.addPerson("123456789", "juan.perez@example.com", "Juan", "Pérez",
                "Main Street", 10, 1, "Madrid");
        agenda.addPerson("123456789", "juan.perez@example.com", "Juan", "Pérez",
                "Main Street", 10, 1, "Madrid");
        agenda.addPerson("987654321", "ana.gomez@example.com", "Ana", "Gómez",
                "Minor Street", 20, 2, "Barcelona");

        agenda.addCompany("555123456", "contact@techsolutions.com", "Tech Solutions",
                "Technology company", "Technology Avenue", 15, 3, "Valencia");
        agenda.addCompany("555123456", "contact@techsolutions.com", "Tech Solutions",
                "Technology company", "Technology Avenue", 15, 3, "Valencia");

        agenda.addGroup("Work");
        agenda.addGroup("Work");

        Contact contact1 = agenda.getContactList().get(0);
        Group groupJob = agenda.getGroupList().get(0);

        groupJob.addContact(contact1);

        System.out.println("The agenda has " + agenda.getContactList().size() + " contact(s).");
        System.out.println("The agenda has " + agenda.getGroupList().size() + " group(s).");

        Group workGroup = agenda.getGroupList().get(0);
        System.out.println("The 'Work' group has " + workGroup.getContactList().size() + " contact(s).");

        Member firstMember = groupJob.getContactList().get(0);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormatter.format(firstMember.getDate());
        System.out.println("Date of first contact added to " + firstMember.getGroup().getName() + " group: "
                + formattedDate);

        workGroup.removeContact(contact1);
        System.out.println("After removal, the 'Work' group has " + workGroup.getContactList().size() + " contact(s).");
    }

}
