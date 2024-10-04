package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Agenda;
import org.ulpgc.is1.model.Address;
import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;

public class Main {
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        agenda.addPerson("123456789", "juan.perez@example.com", "Juan", "Pérez",
                "Calle Mayor", 10, 1, "Madrid");
        agenda.addPerson("987654321", "ana.gomez@example.com",  "Ana", "Gómez",
                "Calle Menor", 20, 2, "Barcelona");

        agenda.addCompany("555123456", "contacto@techsolutions.com", "Tech Solutions",
                "Empresa de tecnología","Avenida de la Tecnología", 15, 3, "Valencia");

        agenda.addGroup("Trabajo");

        Contact contact1 = agenda.getContactList().get(0);
        Group groupJob = agenda.getGroupList().get(0);
        groupJob.addContact(contact1);

        System.out.println("La agenda tiene " + agenda.getContactList().size() + " contacto(s).");

        Group workGroup = agenda.getGroupList().get(0);
        System.out.println("El grupo 'Trabajo' tiene " + workGroup.getContactList().size() + " contacto(s).");

        workGroup.removeContact(contact1);
        System.out.println("Después de eliminar, el grupo 'Trabajo' tiene " + workGroup.getContactList().size() + " contacto(s).");
    }

}