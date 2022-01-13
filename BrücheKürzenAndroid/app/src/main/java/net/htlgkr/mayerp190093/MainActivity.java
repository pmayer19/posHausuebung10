package net.htlgkr.mayerp190093;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onClick(View view) {
        EditText etZaehler = findViewById(R.id.zaehler);
        EditText etNenner = findViewById(R.id.nenner);

        String sZaehler = etZaehler.getText().toString();
        String sNenner = etNenner.getText().toString();

        int iZaehler = Integer.parseInt(sZaehler);
        int iNenner = Integer.parseInt(sNenner);

        int erg = 0;

        if (iZaehler == 0)s
            erg = iNenner;
        while (iNenner != 0) {
            int i = iZaehler % iNenner;
            iZaehler = iNenner;
            iNenner = i;
        }

        erg = iZaehler;

        iZaehler = Integer.parseInt(etZaehler.getText().toString())/erg;
        iNenner = Integer.parseInt(etNenner.getText().toString())/erg;

        String ausgZaehler = String.valueOf(iZaehler);
        String ausgNenner = String.valueOf(iNenner);

        etZaehler.setText(ausgZaehler);
        etNenner.setText(ausgNenner);


    }

}
