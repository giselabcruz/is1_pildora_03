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
                "Calle Mayor", 10, 1, "Madrid");
        agenda.addPerson("123456789", "juan.perez@example.com", "Juan", "Pérez",
                "Calle Mayor", 10, 1, "Madrid");
        agenda.addPerson("987654321", "ana.gomez@example.com",  "Ana", "Gómez",
                "Calle Menor", 20, 2, "Barcelona");

        agenda.addCompany("555123456", "contacto@techsolutions.com", "Tech Solutions",
                "Empresa de tecnología","Avenida de la Tecnología", 15, 3, "Valencia");
        agenda.addCompany("555123456", "contacto@techsolutions.com", "Tech Solutions",
                "Empresa de tecnología","Avenida de la Tecnología", 15, 3, "Valencia");

        agenda.addGroup("Trabajo");
        agenda.addGroup("Trabajo");

        Contact contact1 = agenda.getContactList().get(0);
        Group groupJob = agenda.getGroupList().get(0);

        groupJob.addContact(contact1);

        System.out.println("La agenda tiene " + agenda.getContactList().size() + " contacto(s).");
        System.out.println("La agenda tiene " + agenda.getGroupList().size() + " grupos(s).");

        Group workGroup = agenda.getGroupList().get(0);
        System.out.println("El grupo 'Trabajo' tiene " + workGroup.getContactList().size() + " contacto(s).");

        Member firstMember = groupJob.getContactList().get(0);
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = dateFormatter.format(firstMember.getDate());
        System.out.println("Date of first contact added to " + firstMember.getGroup().getName() + " group : "
                + formattedDate);

        workGroup.removeContact(contact1);
        System.out.println("Después de eliminar, el grupo 'Trabajo' tiene " + workGroup.getContactList().size() + " contacto(s).");
    }

}