package com.wrxx666.carpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThemeMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_menu);
        Button gdmButton = (Button) findViewById(R.id.gdmButton);
        gdmButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.gdmButton:
                i = new Intent(this,GasDistributionMenu.class);
                startActivity(i);
                break;
        }

    }
}