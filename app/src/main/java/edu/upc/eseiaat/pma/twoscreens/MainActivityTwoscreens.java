package edu.upc.eseiaat.pma.twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivityTwoscreens extends AppCompatActivity {

    private EditText editTextNom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_twoscreens);
        editTextNom = (EditText) findViewById(R.id.editTextNom);
    }

    public void saludar(View view) {
        Intent intent = new Intent(this, SecondActivity.class); //Per crear una activitat s'utilitzen objectes de la clase intent
        String nom = editTextNom.getText().toString();
        intent.putExtra(SecondActivity.KEY_NOM, nom );
        startActivity(intent);
    }
}