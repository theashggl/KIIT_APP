package com.example.kiitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void cse(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://computer.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void etc(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://electronics.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void civil(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://civil.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void mech(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://mechanical.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void management(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ksom.ac.in/faculties/"));
        startActivity(intent);
    }
    public void med(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://kims.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void law(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://law.kiit.ac.in/faculties/"));
        startActivity(intent);
    }
    public void homepage(View v){
        Intent intent=new Intent(Main4Activity.this,Main2Activity.class);
        startActivity(intent);

    }
}
