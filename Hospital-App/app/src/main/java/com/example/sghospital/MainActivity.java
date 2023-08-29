package com.example.sghospital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bGOO,bG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bGOO=findViewById(R.id.bGO);
        bG=findViewById(R.id.button1);

        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(400000);

                } catch (Exception e) {

                    e.printStackTrace();
                } finally {

                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
            }

        };
        thread.start();
        bGOO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        bG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}