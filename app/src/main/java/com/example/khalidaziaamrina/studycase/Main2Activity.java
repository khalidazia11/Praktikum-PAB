package com.example.khalidaziaamrina.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Main2Activity extends AppCompatActivity {
String Tmenu, Tporsi, Ttempat;
TextView menuTextView, porsiTextView, hargaTextView, tempatText;
int osas = 65500;
int harga, total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = this.getIntent();
        Tmenu = intent.getStringExtra("menu");
        Tporsi = intent.getStringExtra("porsi");
        Ttempat = intent.getStringExtra("tempat");

        menuTextView = findViewById(R.id.textView8);
        porsiTextView = findViewById(R.id.textView11);
        hargaTextView = findViewById(R.id.textView10);
        tempatText = findViewById(R.id.textView5);

        tempatText.setText(Ttempat);
        menuTextView.setText(Tmenu);
        porsiTextView.setText(Tporsi);

        switch (Ttempat){
            case "EATBUS":
                harga = 50000;
                break;
            case "ABNORMAL":
                harga = 30000;
                break;
        }
        total = parseInt(Tporsi)*harga;
        String hargaTotal = Integer.toString(total);
        if(total < osas){
            hargaTextView.setText(hargaTotal);
            Toast.makeText(this, "dinner disini aja!", Toast.LENGTH_SHORT).show();
        }else{
            hargaTextView.setText(hargaTotal);
            Toast.makeText(this, "Uang mu tidak cukup", Toast.LENGTH_SHORT).show();
        }
    }
}
