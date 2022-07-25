package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onBtnClick(View view){
        TextView vorname = findViewById(R.id.textView);
        TextView nachname = findViewById(R.id.textView2);
        TextView email = findViewById(R.id.textView3);
        EditText editTxtName = findViewById(R.id.editTextPersonName);
        EditText editTxtName2 = findViewById(R.id.editTextPersonName2);
        EditText editTxtName3 = findViewById(R.id.editTextPersonName3);
        vorname.setText(editTxtName.getText().toString());
        nachname.setText(editTxtName2.getText().toString());
        email.setText(editTxtName3.getText().toString());
    }
}