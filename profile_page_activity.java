package com.example.navigationalbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import android.widget.Button;
import android.view.View;
//import androidx.appcompat.app.AppCompatActivity;

public class profile_page_activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);

        Button addTask = (Button) findViewById(R.id.addTask_button);

        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(profile_page_activity,addTask_page.class);
                //startActivity(intent);
            }
        });

        Button gallery = (Button) findViewById(R.id.gallery_button2);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(profile_page_activity.this,);
                //startActivity(intent);
            }
        });

        Button history = (Button) findViewById(R.id.history_button);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(profile_page_activity.this,);
                //startActivity(intent);

            }
        });

        Button edit = (Button) findViewById(R.id.edit_button);
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(profile_page_activity.this,);
                //startActivity(intent);

            }
        });

    }
}
