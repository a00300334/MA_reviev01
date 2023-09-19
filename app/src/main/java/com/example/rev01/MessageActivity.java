package com.example.rev01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        // Assign the text view
        TextView messageTextView = findViewById(R.id.message_text);

        //Get the message from the content
        Intent intent = getIntent();

        //Display the message
        String message = intent.getStringExtra(MainActivity.MESSAGE_KEY);
        messageTextView.setText(message);
    }




}