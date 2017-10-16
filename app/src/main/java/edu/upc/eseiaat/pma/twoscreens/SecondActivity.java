package edu.upc.eseiaat.pma.twoscreens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    //public perque s'ha de poder accedir desde laltre activitat
    //static perque es tipus classe
    public static String KEY_NOM = "KEY_NOM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String nom = getIntent().getExtras().getString(KEY_NOM);//recollim el nom i ara el tractem aqui
        String missatge = String.format(getString(R.string.missatgesalutacio), nom);//formategem el missatge per tal que ens surti el missatge de salutació i el nom que nosaltres li hem dit amb el %s en el recurs creat
        TextView textView = (TextView) findViewById(R.id.textViewSalutacio);
        textView.setText(missatge);//passem pel text view el missatge formatejat amb la salutacio i el nom que hem introduit
    }
}
