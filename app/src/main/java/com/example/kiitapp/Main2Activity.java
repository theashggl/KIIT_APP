package com.example.kiitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public  void fees(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.kalingauniversity.edu.in/ProImg/Fee%20Structure.pdf"));
        startActivity(intent);
    }
    public  void fac(View v){
        Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(intent);
    }
    public  void gallery(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com/search?sxsrf=ACYBGNT_WFVpvt0No0rjyGW56hXnbEyniw:1567945036455&q=kiit+gallery&tbm=isch&source=univ&sxsrf=ACYBGNT_WFVpvt0No0rjyGW56hXnbEyniw:1567945036455&sa=X&ved=2ahUKEwiijbO3msHkAhXKXCsKHZasCRQQsAR6BAgHEAE&biw=1707&bih=821&dpr=1.13"));
        startActivity(intent);
    }
    public  void dep(View v){
        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);

        startActivity(intent);
    }
    public  void course(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://kiit.ac.in/academics/courses/"));
        startActivity(intent);
    }
    public  void management(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.kiit.ac.in/campuslife/"));
        startActivity(intent);
    }
    public  void activity(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://ksac.kiit.ac.in/"));
        startActivity(intent);
    }
     public void web(View v){
         Intent intent=new Intent(Intent.ACTION_VIEW);
         intent.setData(Uri.parse("http://kiit.ac.in"));
         startActivity(intent);
     }
}
