package com.example.luana.cdespesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText edtRenda;
    private Button ok;
    private float teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtRenda = (EditText) findViewById(R.id.edtRenda);
        float teste = Float.parseFloat(edtRenda.getText().toString());
    }

}
