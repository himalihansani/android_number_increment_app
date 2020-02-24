package com.example.myfirstproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    private TextView txtCounter;
    private Button btn;
    int currentID =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtCounter = (TextView)findViewById(R.id.txtCounter);
        btn=(Button)findViewById(R.id.btn);

    }

    public void onBtnIncrementClicker( View v) {
        currentID++;
        //alter max num reached

        if (currentID > 10)
        {
            new AlertDialog.Builder(MainActivity.this).setTitle("Maximum limit exceeded").setMessage("max exceed").show();
        }

        else
            txtCounter.setText(String.valueOf(currentID));
    }


}
