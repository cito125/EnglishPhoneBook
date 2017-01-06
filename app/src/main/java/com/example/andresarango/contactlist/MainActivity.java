package com.example.andresarango.contactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.andresarango.contactlist.contact_recyclerview.ContactsAdapter;
import com.example.andresarango.contactlist.model.contact.Phonebook;
import com.example.andresarango.contactlist.model.english_contact.EnglishContact;
import com.example.andresarango.contactlist.model.english_contact.EnglishPhoneBook;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerviewContacts;
    private RecyclerView.Adapter mAdapterContacts = new ContactsAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRecyclerView();

    }

    private void setUpRecyclerView() {
        mRecyclerviewContacts = (RecyclerView) findViewById(R.id.contact_recyclerview);
        mRecyclerviewContacts.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerviewContacts.setAdapter(mAdapterContacts);
        setUpContactsTest();
    }

    private void setUpContactsTest() {
        Phonebook englishPhonebook = new EnglishPhoneBook();
        englishPhonebook.addContact(new EnglishContact("Andres"));
        englishPhonebook.addContact(new EnglishContact("Alexis"));
        englishPhonebook.addContact(new EnglishContact("Alejandro"));
        englishPhonebook.addContact(new EnglishContact("Loco"));
        ((ContactsAdapter) mAdapterContacts).updateContactList(
                ((EnglishPhoneBook) englishPhonebook).getmPhoneBook());
    }
}
