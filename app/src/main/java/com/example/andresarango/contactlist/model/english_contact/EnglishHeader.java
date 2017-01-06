package com.example.andresarango.contactlist.model.english_contact;

import com.example.andresarango.contactlist.contact_recyclerview.ContactListItemWrapper;
import com.example.andresarango.contactlist.model.contact.Header;

/**
 * Created by andresarango on 1/4/17.
 */

public class EnglishHeader extends Header implements ContactListItemWrapper {

    private int mHeader;

    public EnglishHeader(int header) {
        mHeader = header;
    }

    public String getHeaderAsString() {
        return Character.toString((char) mHeader);
    }

    public int getmHeader() {
        return mHeader;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnglishHeader)) {
            return false;
        }
        return mHeader == ((EnglishHeader) obj).getmHeader();
    }

    @Override
    public int hashCode() {
        return mHeader;
    }

    @Override
    public int compareTo(Header header) {
        if (mHeader < ((EnglishHeader) header).getmHeader()) {
            return -1;
        }
        if (mHeader > ((EnglishHeader) header).getmHeader()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String getDisplayText() {
        return getHeaderAsString();
    }
}
