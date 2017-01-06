package com.example.andresarango.contactlist.model.contact;

/**
 * Created by andresarango on 1/4/17.
 */

public interface Phonebook {
    void makePhonebook();

    void addContact(Contact contact);

    void removeContact(Contact contact);

    void clearPhonebook();
}
