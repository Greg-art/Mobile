package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ImcActiviy extends AppCompatActivity {
    String name;
    Double weight, height;

    TextView tvName, tvHeight, tvWeight, tvIMC;
    DecimalFormat decimalFormat =new DecimalFormat("##,###,###,##0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Bundle bundle = getIntent().getExtras();
         name = bundle.getString("name");
         weight = bundle.getDouble("weight");
         height = bundle.getDouble("height");

        tvName=findViewById(R.id.tvName);
        tvWeight=findViewById(R.id.tvWeight);
        tvHeight=findViewById(R.id.tvHeight);
        tvIMC=findViewById(R.id.tvIMC);

    }

    @Override
    protected void onStart() {
        super.onStart();

        tvName.setText(name);
        tvWeight.setText(weight.toString());
        tvHeight.setText(height.toString());
        tvIMC.setText( decimalFormat.format( calculateIMC(weight, height) ));

    }

    public Double calculateIMC(Double weight, Double height){
        Double imc = weight/(height*height);
        return imc;
    }

}