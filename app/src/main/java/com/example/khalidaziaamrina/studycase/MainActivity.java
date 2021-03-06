package com.example.khalidaziaamrina.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstEditText, secondEditText;
    private Button eatbusBtn, abnormalBtn;
    private String menu, porsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstEditText = (EditText)findViewById(R.id.first_edittext);
        secondEditText = (EditText)findViewById(R.id.second_edittext);
        eatbusBtn = findViewById(R.id.eatbus_btn);
        abnormalBtn = findViewById(R.id.abnormal_btn);

        menu = firstEditText.getText().toString();
        porsi = secondEditText.getText().toString();

    }

    public void keEatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String tempat = eatbusBtn.getText().toString();

        menu = firstEditText.getText().toString();
        porsi = secondEditText.getText().toString();


        if (menu.isEmpty()||porsi.isEmpty()){
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        }else {
            intent.putExtra("menu", menu);
            intent.putExtra("porsi", porsi);
            intent.putExtra("tempat", tempat);
            startActivity(intent);
        }
    }
    public void keAbnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        String tempat = abnormalBtn.getText().toString();

        menu = firstEditText.getText().toString();
        porsi = secondEditText.getText().toString();


        if (menu.isEmpty()||porsi.isEmpty()){
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        }else {
            intent.putExtra("menu", menu);
            intent.putExtra("porsi", porsi);
            intent.putExtra("tempat", tempat);
            startActivity(intent);
        }


    }
}
