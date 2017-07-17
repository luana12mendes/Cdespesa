package com.example.luana.cdespesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btDesp, btRenda, btListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // final EditText nome = (EditText) findViewById(R.id.edtNome);
        Button btDesp = (Button) findViewById(R.id.button3);
        btDesp.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
               // intent.putExtra("nome", nome.getText().toString());
                startActivity(intent); } });


        Button btRenda = (Button) findViewById(R.id.button4);
        btRenda.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                // intent.putExtra("nome", nome.getText().toString());
                startActivity(intent); } });

        Button btListar = (Button) findViewById(R.id.button5);
        btListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                // intent.putExtra("nome", nome.getText().toString());
                startActivity(intent);}
        });


    }

}



