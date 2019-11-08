package com.example.sherlockholmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static final private int CHOOSE_THIEF = 0;

    public void onClick(View view) {
        Intent questionIntent = new Intent(MainActivity.this, ChooseActivity.class);
        startActivityForResult(questionIntent, CHOOSE_THIEF);
    }

    protected void OnActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);

        if (requestCode == CHOOSE_THIEF) {
            if (resultCode == RESULT_OK) {
                String thiefname = data.getStringExtra(ChooseActivity.THIEF);
                infoTextView.setText(thiefname);
            }else {
                infoTextView.setText("");//стираем текст
            }
        }
    }
}