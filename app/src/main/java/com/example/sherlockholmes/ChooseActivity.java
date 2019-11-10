package com.example.sherlockholmes;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;


public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_choose);
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
