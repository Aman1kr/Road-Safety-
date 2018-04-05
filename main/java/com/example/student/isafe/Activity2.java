package com.example.student.isafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by student on 04-04-2018.
 */
public class Activity2 extends AppCompatActivity {
    private static Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btn4 = (Button) findViewById(R.id.button4);
    }
    public void soft(View view)
    {
        startActivity(new Intent(this,Activity5.class));
    }

}