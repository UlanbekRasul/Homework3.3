 package com.example.homework33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
     private boolean isClick= false;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         getSupportFragmentManager().beginTransaction().add(R.id.cont,
                 new BlankFragment()).commit();
         Toast.makeText(this," ", Toast.LENGTH_SHORT).show();

     }
 }