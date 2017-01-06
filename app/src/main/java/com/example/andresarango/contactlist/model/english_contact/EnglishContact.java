package com.example.andresarango.contactlist.model.english_contact;

import com.example.andresarango.contactlist.model.contact.Contact;
import com.example.andresarango.contactlist.contact_recyclerview.ContactListItemWrapper;

/**
 * Created by andresarango on 1/4/17.
 */

public class EnglishContact extends Contact implements ContactListItemWrapper {

    private String mName;

    public EnglishContact(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnglishContact)) {
            return false;
        }
        return mName.equals(((EnglishContact) obj).getName());
    }

    @Override
    public int hashCode() {
        return mName.hashCode();
    }

    @Override
    public int compareTo(Contact contact) {
        return mName.compareTo(contact.getName());
    }

    @Override
    public String getDisplayText() {
        return mName;
    }
}
