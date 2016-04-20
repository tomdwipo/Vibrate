package com.tommyputranto.vibrate;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button getarBtn;

    private Vibrator getar; //tambahkan Vibrator

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getar = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE) ;//deklarasikan vibrator
        getarBtn = (Button)findViewById(R.id.button_getar);
        getarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getar.vibrate(500); // bergetar dalam satuan ms
            }
        });
    }
}
