package com.Sinjin.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {
    public static final String MSG = "com.example.multiscreen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void OrderList(View view) {
        Intent intent = new Intent(this,OrderAcitivity.class);

        EditText editText = findViewById(R.id.name);
        String value = editText.getText().toString();
        intent.putExtra(MSG,value);
        startActivity(intent);

    }
}