package com.example.rev01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE_KEY = "Mainactivity.message";
    //Once is declared, message key will take only one space in the memory
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitMessage(View view) {
        //get the text from text view
        EditText editText = findViewById(R.id.message_edit_text);
        String message = editText.getText().toString();

        //create an intent ( to open new activity )
        Intent intent = new Intent(this, MessageActivity.class);

        // package the message from Edit Text
        intent.putExtra(MESSAGE_KEY, message);

        // fire the intent.
        startActivity(intent);
    }
}