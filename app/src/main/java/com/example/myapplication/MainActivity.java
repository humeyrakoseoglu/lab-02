package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On Create works!!!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("On Start works!!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume works!!!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause works!!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop works!!!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("On Destroy works!!!");
    }

    public void buttonClick(View view){
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName) ;
        String name=editText.getText().toString();
        System.out.println("Button click works!!! Name:"+name);


        Intent intent= new Intent(this,SecondActivity.class);
        intent.putExtra("customerName",name);
        startActivity(intent);
    }
}