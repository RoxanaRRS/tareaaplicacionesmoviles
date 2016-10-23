package com.roxana.roxana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    ImageView imageV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.ERahel);
        textView.setText("Ingeniera Roxana Raquel Rodríguez Sequeira " +
                "estudia\n" +
                "    segundo año en la Universidad Centroamericana, puede tocar tocar el piano y le encanta leer.\n" +
                "     Sus Padres Silvia Sequeira y Marcos Rodríguez\n" +
                "    nació en Diriamba, Nicaragua");

        imageV = (ImageView)findViewById(R.id.imageV);
    }
}
