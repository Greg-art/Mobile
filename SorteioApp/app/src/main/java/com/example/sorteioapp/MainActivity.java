package com.example.sorteioapp;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText edInicial, edFinal;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edInicial=findViewById(R.id.editTextValorInicial);

        edFinal=findViewById(R.id.editTextValorFinal);
        textView=findViewById(R.id.textViewValorSorteado);
    }

    public void sorteioNumero(View view){
        int vInicial=0,vFinal=0;
        vInicial = Integer.parseInt(edInicial.getText().toString());
        vFinal = Integer.parseInt(edFinal.getText().toString());

        int numeroSorteado = new Random().nextInt((vFinal - vInicial)+1)+vInicial;
        Log.i("ValoRandom", Integer.toString(numeroSorteado));

        textView.setText(Integer.toString(numeroSorteado));


    }
}
