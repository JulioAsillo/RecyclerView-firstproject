package com.example.recyclerview_firstproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        saveContact()

        return super.onOptionsItemSelected(item)
    }

    private fun saveContact() {
        val name = etName_fin.text.toString()
        val telephone = etTelephoneFin.text.toString()

        val intent = Intent()

        intent.putExtra("keyName", name)
        intent.putExtra("keyTelephone", telephone)

        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}