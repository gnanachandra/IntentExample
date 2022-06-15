package com.example.externallab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button btn;
    public static final String name = "com.example.externallab.extra.Name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void openActivity(View view)
    {
        editText = findViewById(R.id.editText);
        btn  = findViewById(R.id.button);
        String usrname = editText.getText().toString();
        Toast.makeText(this, "going to second activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(name,usrname);
        startActivity(intent);
    }
}