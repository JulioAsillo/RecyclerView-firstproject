package com.example.recyclerview_firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var contacts = ArrayList<Contact>()

    var contactAdapter = ContactAdapter(contacts)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadContacts()

        initView()
    }

    private fun initView() {
        val rvContact = findViewById<RecyclerView>(R.id.rvcContact)

        rvContact.adapter=contactAdapter

        rvContact.layoutManager = LinearLayoutManager(this)
    }

    private fun loadContacts() {
        contacts.add(Contact("Leonardo da Vinci", "123456789"))
        contacts.add(Contact("Cleopatra", "987654321"))
        contacts.add(Contact("William Shakespeare", "555555555"))
        contacts.add(Contact("Napoleon Bonaparte", "111111111"))
        contacts.add(Contact("Queen Elizabeth I", "222222222"))
        contacts.add(Contact("Julius Caesar", "333333333"))
        contacts.add(Contact("Marilyn Monroe", "444444444"))
        contacts.add(Contact("Albert Einstein", "666666666"))
        contacts.add(Contact("George Washington", "777777777"))
        contacts.add(Contact("Amelia Earhart", "888888888"))
        contacts.add(Contact("Pablo Picasso", "999999999"))
        contacts.add(Contact("Martin Luther King Jr.", "121212121"))
        contacts.add(Contact("Marie Curie", "343434343"))
        contacts.add(Contact("Vincent van Gogh", "565656565"))
        contacts.add(Contact("Wolfgang Amadeus Mozart", "787878787"))
        contacts.add(Contact("Alexander the Great", "232323232"))
        contacts.add(Contact("Catherine the Great", "454545454"))
        contacts.add(Contact("Charles Darwin", "676767676"))
        contacts.add(Contact("Emily Dickinson", "898989898"))
        contacts.add(Contact("Frida Kahlo", "010101010"))
        contacts.add(Contact("Winston Churchill", "111111111"))
        contacts.add(Contact("Adolf Hitler", "222222222"))
        contacts.add(Contact("Joseph Stalin", "333333333"))
        contacts.add(Contact("Franklin D. Roosevelt", "444444444"))
        contacts.add(Contact("Benito Mussolini", "555555555"))
        contacts.add(Contact("Dwight D. Eisenhower", "666666666"))
        contacts.add(Contact("Erwin Rommel", "777777777"))
        contacts.add(Contact("Anne Frank", "888888888"))
        contacts.add(Contact("Hirohito", "999999999"))
        contacts.add(Contact("George S. Patton", "121212121"))
    }
}