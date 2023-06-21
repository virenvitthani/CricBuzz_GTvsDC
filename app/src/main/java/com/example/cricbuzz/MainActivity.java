package com.example.cricbuzz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView gt_img,dc_img;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gt_img=findViewById(R.id.gt_img);
        dc_img=findViewById(R.id.dc_img);

        gt_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,listview_activity_secpage.class);
                intent.putExtra("team","GT");
                startActivity(intent);
            }
        });

        dc_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,listview_activity_secpage.class);
                intent.putExtra("team","DC");
                startActivity(intent);
            }
        });
    }
}