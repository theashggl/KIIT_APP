package com.example.kiitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void cse(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://computer.kiit.ac.in"));
        startActivity(intent);
    }
    public void etc(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://electronics.kiit.ac.in"));
        startActivity(intent);
    }
    public void civil(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://civil.kiit.ac.in"));
        startActivity(intent);
    }
    public void mech(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://mechanical.kiit.ac.in"));
        startActivity(intent);
    }
    public void management(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ksom.ac.in"));
        startActivity(intent);
    }
    public void med(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://kims.kiit.ac.in"));
        startActivity(intent);
    }
    public void law(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://law.kiit.ac.in"));
        startActivity(intent);
    }
     public void homepage(View v){
         Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
         startActivity(intent);

     }
}
