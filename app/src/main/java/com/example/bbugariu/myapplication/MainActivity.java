package com.example.bbugariu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.bbugariu.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage (View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); // -> this activity does not exist yet
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        if (message.length() > 0) {
            startActivity(intent);
        } else {
            AlertHelper alert = new AlertHelper();
            alert.build(R.string.input_is_null, this).show();
        }
    }
}
