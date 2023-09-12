package com.example.acara_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView tombol = findViewById(R.id.btn1);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayout.class);

                startActivity(intent);
            }
        });

        CardView tombol2 = findViewById(R.id.btn2);

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect = new Intent(MainActivity.this, RelativeLayout.class);

                startActivity(connect);
            }
        });

        CardView tombol3 = findViewById(R.id.btn3);

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect2 = new Intent(MainActivity.this, ConstraintLayout.class);

                startActivity(connect2);
            }
        });

        CardView tombol4 = findViewById(R.id.btn4);

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect3 = new Intent(MainActivity.this, FrameLayout.class);

                startActivity(connect3);
            }
        });

        CardView tombol5 = findViewById(R.id.btn5);

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect4 = new Intent(MainActivity.this, TableLayout.class);

                startActivity(connect4);
            }
        });

        CardView tombol6 = findViewById(R.id.btn6);

        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect5 = new Intent(MainActivity.this, ScrollView.class);

                startActivity(connect5);
            }
        });

        CardView tombol7 = findViewById(R.id.btn7);

        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent connect6 = new Intent(MainActivity.this, HorizontalLayout.class);

                startActivity(connect6);
            }
        });



    }
}