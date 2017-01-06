package com.example.andresarango.contactlist.contact_recyclerview;

import android.view.View;
import android.widget.TextView;

import com.example.andresarango.contactlist.model.english_contact.EnglishContact;

/**
 * Created by andresarango on 1/5/17.
 */

public class ContactViewHolder extends ContactListViewHolder {
    public ContactViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindViewHolder(ContactListItemWrapper contactListItemWrapper) {
        ((TextView) itemView).setText(contactListItemWrapper.getDisplayText());
    }
}
