package com.chaquotestversion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button history_button;
    Button buttonBack;
    Button physics_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBack = (Button) findViewById(R.id.BackButton);

        history_button= (Button) findViewById(R.id.History);
        history_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuizPage();
            }
        });

        physics_button = (Button) findViewById(R.id.Physics);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });
    }
    public void openQuizPage(){
        Intent goToQuiz = new Intent(this, MainPage.class);
        startActivity(goToQuiz);
    }

    public void openLoginActivity(){
    }

}