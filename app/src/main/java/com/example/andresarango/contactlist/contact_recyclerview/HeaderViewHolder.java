package com.example.andresarango.contactlist.contact_recyclerview;

import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by andresarango on 1/5/17.
 */

public class HeaderViewHolder extends ContactListViewHolder {
    public HeaderViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindViewHolder(ContactListItemWrapper contactListItemWrapper) {
        ((TextView) itemView).setText(contactListItemWrapper.getDisplayText());
    }
}
