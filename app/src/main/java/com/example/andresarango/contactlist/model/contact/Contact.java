package com.example.andresarango.contactlist.model.contact;

/**
 * Created by andresarango on 1/4/17.
 */

public abstract class Contact implements Comparable<Contact> {
    public abstract String getName();

    @Override
    public abstract boolean equals(Object obj);


    @Override
    public abstract int hashCode();

}
