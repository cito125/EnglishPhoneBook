package com.example.andresarango.contactlist.model.english_contact;

import com.example.andresarango.contactlist.model.contact.Contact;
import com.example.andresarango.contactlist.model.contact.Phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by andresarango on 1/4/17.
 */

public class EnglishPhoneBook implements Phonebook {

    private Map<EnglishHeader, Set<EnglishContact>> mPhoneBook = new TreeMap<>();


    public Map<EnglishHeader, Set<EnglishContact>> getmPhoneBook() {
        return mPhoneBook;
    }

    public EnglishPhoneBook() {
        makePhonebook();
    }

    @Override
    public void makePhonebook() {
        for (int i = 65; i < 91; i++) {
            mPhoneBook.put(new EnglishHeader(i), new TreeSet<EnglishContact>());
        }
    }

    @Override
    public void addContact(Contact contact) {
        EnglishContact englishContact = (EnglishContact) contact;
        List<Set<EnglishContact>> contactList = new ArrayList<>(mPhoneBook.values());
        int index = getContactIndex(englishContact.getName().charAt(0));
        contactList.get(index).add(englishContact);
    }

    @Override
    public void removeContact(Contact contact) {
        EnglishContact englishContact = (EnglishContact) contact;
        List<Set<EnglishContact>> contactList = new ArrayList<>(mPhoneBook.values());
        int index = getContactIndex(englishContact.getName().charAt(0));
        contactList.get(index).remove(contact);
    }

    @Override
    public void clearPhonebook() {
        mPhoneBook.clear();
        makePhonebook();
    }

    private int getContactIndex(int firstLetter) {
        if (firstLetter < 91) {
            return firstLetter - 65;
        }
        return firstLetter - 97;
    }

}
