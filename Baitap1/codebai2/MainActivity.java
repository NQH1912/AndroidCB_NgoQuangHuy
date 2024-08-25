package com.example.baitap2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
       TextView txtRandom;
       Button random;
       private void control(){
           txtRandom=findViewById(R.id.txtRandom);
           random=findViewById(R.id.random);
         random.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
               Random random = new Random();
               int randomnumber =random.nextInt(6-1+1)+1;
               txtRandom.setText(randomnumber);
             }
         });
       }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
           control();
    }
}