package com.example.nevoishcalc

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat


lateinit var buttonsms: Button
lateinit var buttonemail: Button
lateinit var buttondial: Button
lateinit var buttoncamera: Button
lateinit var buttonstk: Button
lateinit var buttonshare: Button
lateinit var buttoncall: Button
class intent : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        buttonsms=findViewById(R.id.sms_button)
        buttonemail=findViewById(R.id.email_button)
        buttoncall=findViewById(R.id.dial_button)
        buttonstk=findViewById(R.id.stk_button)
        buttoncamera=findViewById(R.id.camera_button)
        buttonshare=findViewById(R.id.share_button)

        buttonsms.setOnClickListener {
            val uri = Uri.parse("smsto:0725231910")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("hello", "work you idiot!")

            startActivity(intent)
        }
        buttoncamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(takePictureIntent, 1)

        }
        buttonstk.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }

        }
        buttonshare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }
        buttondial.setOnClickListener {
            val phone = "+34666777888"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)
        }
        buttonemail.setOnClickListener {
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "abc@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))


        }
    }

}