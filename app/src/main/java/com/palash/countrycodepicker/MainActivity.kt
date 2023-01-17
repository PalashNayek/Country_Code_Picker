package com.palash.countrycodepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.hbb20.CountryCodePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ccp : CountryCodePicker= findViewById(R.id.ccp)
        val phoneNumber : EditText = findViewById(R.id.edtPhoneNumber)

        //connecting edittext phone number with country code picker
        ccp.registerCarrierNumberEditText(phoneNumber)

        val btn: Button = findViewById(R.id.btnCheck)
        btn.setOnClickListener {
            Toast.makeText(this, "Number : +${ccp.fullNumber}", Toast.LENGTH_LONG).show()
        }
    }
}