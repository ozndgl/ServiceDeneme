package com.consoledeneme.servicedeneme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aSwitch=findViewById(R.id.switch2);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){

                    System.out.println("swich if");
                    startService(new Intent(MainActivity.this,MyServis.class));

                }
                else
                {
                    stopService(new Intent(MainActivity.this,MyServis.class));

                }
            }
        });



    }








    }
