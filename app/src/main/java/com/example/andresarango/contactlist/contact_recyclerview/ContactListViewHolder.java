package com.example.andresarango.contactlist.contact_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by andresarango on 1/3/17.
 */
public abstract class ContactListViewHolder extends RecyclerView.ViewHolder{
    public ContactListViewHolder(View itemView) {
        super(itemView);
    }
    public abstract void bindViewHolder(ContactListItemWrapper contactListItemWrapper);
}
