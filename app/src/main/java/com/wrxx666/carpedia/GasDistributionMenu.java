package com.wrxx666.carpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GasDistributionMenu extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gas_distribution_menu);
        Button whatIsGDMbutton = (Button) findViewById(R.id.whatIsGDMbutton);
        whatIsGDMbutton.setOnClickListener(this);
        Button GDMCharactButton = (Button) findViewById(R.id.GDMCharactButton);
        GDMCharactButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.whatIsGDMbutton:
                i = new Intent(this,FirstGDMTheme.class);
                startActivity(i);
                break;
            case R.id.GDMCharactButton:
                i = new Intent(this,GDMCharact.class);
                startActivity(i);
                break;
        }
    }
}