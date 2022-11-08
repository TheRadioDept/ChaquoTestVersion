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

        Button go_back = (Button) findViewById(R.id.returnToMenu);
        go_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                return_to_menu();
            }
        });
    }

    public void return_to_menu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
