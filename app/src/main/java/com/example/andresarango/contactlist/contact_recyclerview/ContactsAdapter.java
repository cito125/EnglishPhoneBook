package com.example.andresarango.contactlist.contact_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.andresarango.contactlist.R;
import com.example.andresarango.contactlist.model.english_contact.EnglishContact;
import com.example.andresarango.contactlist.model.english_contact.EnglishHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by andresarango on 1/3/17.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactListViewHolder> {
    private List<ContactListItemWrapper> mContactList = new ArrayList<>();
    private Map<EnglishHeader, Set<EnglishContact>> mPhoneMap = new TreeMap<>();

    @Override
    public ContactListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == 1){
            return new HeaderViewHolder(LayoutInflater.from(parent.getContext())
            .inflate(R.layout.header_viewholder,parent,false));
        }
        return new ContactViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_viewholder,parent,false));
    }

    @Override
    public void onBindViewHolder(ContactListViewHolder holder, int position) {
        holder.bindViewHolder(mContactList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        if(mContactList.get(position) instanceof  EnglishHeader){
            return 1;
        }
        return 2;
    }

    @Override
    public int getItemCount() {
        return mContactList.size();
    }

    public void updateContactList(Map<EnglishHeader, Set<EnglishContact>> phoneMap){
        setPhoneMap(phoneMap);
        for(EnglishHeader englishHeader: mPhoneMap.keySet()){
            if(!mPhoneMap.get(englishHeader).isEmpty()){
                mContactList.add(englishHeader);
                mContactList.addAll(mPhoneMap.get(englishHeader));
            }
        }
        notifyDataSetChanged();
    }

    private void setPhoneMap(Map<EnglishHeader, Set<EnglishContact>> phoneMap) {
        mPhoneMap.clear();
        mPhoneMap.putAll(phoneMap);
    }
}
