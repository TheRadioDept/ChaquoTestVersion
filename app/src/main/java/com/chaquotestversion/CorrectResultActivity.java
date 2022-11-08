package com.chaquotestversion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CorrectResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_result_activity);

        Button info_button = (Button) findViewById(R.id.get_link);
        Button cancel_button = (Button) findViewById(R.id.cancel_button);

        info_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBrowser();

            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                returnToMain();
            }
        });
    }

    public void openBrowser(){

    }


    public void returnToMain(){
        Intent return_to_main = new Intent(this, MainActivity.class);
        startActivity(return_to_main);
    }

}

