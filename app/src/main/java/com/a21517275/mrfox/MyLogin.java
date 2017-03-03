package com.a21517275.mrfox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import junit.framework.TestCase;
import junit.framework.TestResult;

public class MyLogin extends AppCompatActivity {
    EditText editarEmail,editarContrasena;
    Button botonEntrar;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);
        editarEmail= (EditText) findViewById(R.id.editEmail);
        editarContrasena= (EditText) findViewById(R.id.editContrasena);
        botonEntrar= (Button) findViewById(R.id.botonEntrar);
    }
    public void entrarScrolling(View view){
        intent=new Intent(this,MyMain.class);
        startActivity(intent);
    }
}
