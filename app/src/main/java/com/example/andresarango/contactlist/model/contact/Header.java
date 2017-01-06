package com.example.andresarango.contactlist.model.contact;

/**
 * Created by andresarango on 1/4/17.
 */

public abstract class Header implements Comparable<Header> {
    public abstract String getHeaderAsString();

    @Override
    public abstract boolean equals(Object obj);


    @Override
    public abstract int hashCode();
}
