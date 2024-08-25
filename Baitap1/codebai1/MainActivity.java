package com.example.baitap1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

     EditText txtX,txtY;
     TextView txtResult;
     Button btnPlus;
     Button btnMinus;
     Button btnMultiplied;
     Button btnDivided;
     Button btnPercentage;
     private void innitcontrol()
     {
         txtX=findViewById(R.id.txtX);
         txtY=findViewById(R.id.txtY);
         txtResult=findViewById(R.id.txtResult);
         btnPlus=findViewById(R.id.btnPlus);
         btnMinus=findViewById(R.id.btnMinus);
         btnMultiplied=findViewById(R.id.btnMultiplied);
         btnDivided=findViewById(R.id.btnDivided);
         btnPercentage=findViewById(R.id.btnPercentage);
         btnPlus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View c) {
                 int x=Integer.parseInt(txtX.getText().toString());
                 int y=Integer.parseInt(txtY.getText().toString());
                 int result=x+y;
                 txtResult.setText(String.valueOf(result));
             }
         });
         btnMinus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View t) {
                 int x=Integer.parseInt(txtX.getText().toString());
                 int y=Integer.parseInt(txtY.getText().toString());
                 int result=x-y;
                 txtResult.setText(String.valueOf(result));
             }
         });
         btnMultiplied.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View n) {
                 int x=Integer.parseInt(txtX.getText().toString());
                 int y=Integer.parseInt(txtY.getText().toString());
                 int result=x*y;
                 txtResult.setText(String.valueOf(result));
             }
         });
         btnDivided.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View ch) {
                 int x=Integer.parseInt(txtX.getText().toString());
                 int y=Integer.parseInt(txtY.getText().toString());
                 int result=x/y;
                 txtResult.setText(String.valueOf(result));
             }
         });
         btnPercentage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View p) {
                 int x=Integer.parseInt(txtX.getText().toString());
                 int y=Integer.parseInt(txtY.getText().toString());
                 int result=(x/100)*y;
                 txtResult.setText(String.valueOf(result));
             }
         });
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitcontrol();
    }
}