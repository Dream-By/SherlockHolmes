package com.example.sherlockholmes;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import javax.xml.transform.Result;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public final static String THIEF = "com.example.sherlockholmes";

    public void onRadioClick(View view) {
        Intent answerIntent = new Intent();

        switch (view.getId()){
            case R.id.radioDog:
                answerIntent.putExtra(THIEF, "Это тот самый пёсик");
                break;
            case R.id.radioCat:
                answerIntent.putExtra(THIEF, "Лошадь Пржевальского");
                break;
            case R.id.radioCrow:
                answerIntent.putExtra(THIEF, "Та самая ворона");
                break;

                default:
                    break;
                    }
                    setResult(RESULT_OK,answerIntent);
                    finish();
    }
}
