package com.example.cricbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

public class listview_activity_secpage extends AppCompatActivity {

    ListView listView;
    ImageView imageView;

    int imgarrgt[] = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
                      R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten};

    String namegt[] = {"David Miller","Shubman Gill","Matthew Wade","Wriddhiman Saha","Kane Williamson",
                       "Urvil Patel","K.S Bharat","Hardik Pandya","Abhinav Manohar","B. Sai Sudharsan"};

    String rollgt[] = {"Batter","Batter","Batter","Wicketkeeper Batter","Batter",
                       "Batter","Batter","All-rounder","All-rounder","All-rounder"};

    String playerinforgt[] = {"1","2","3","4","5","6","7","8","9","10"};


    int imgarrdc[] = {R.drawable.eleven,R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen,
                      R.drawable.sixteen,R.drawable.seventeen,R.drawable.eighteen,R.drawable.nineteen,R.drawable.twenty};

    String namedc[] = {"David Warner","Prithvi Shaw","Rovman Powell","Axar Patel","Lalit Yadav",
                       "Mitchell Marsh","Kamlesh Nagarkoti","Pravin Dubey","Vicky Ostwal","Anrich Nortje"};

    String rolldc[] = {"Batter","Batter","Batter","All-rounder","All-rounder",
                       "All-rounder","Bowler","Bowler","Bowler","Bowler"};

    String playerinfordc[] = {"11","12","13","14","15","16","17","18","19","20"};

    MyAdapter adapter;
    String team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_secpage);
        listView=findViewById(R.id.listview);
        team=getIntent().getStringExtra("team");

        if(team.equals("GT"))
        {
            adapter=new MyAdapter(listview_activity_secpage.this,imgarrgt,namegt,rollgt,playerinforgt);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(listview_activity_secpage.this,Details_Activity_thirdPage.class);
                    intent.putExtra("pos",position);
                    intent.putExtra("name",namegt);
                    intent.putExtra("roll",rollgt);
                    intent.putExtra("playerinfor",playerinforgt);
                    intent.putExtra("imgarr",imgarrgt);
                    startActivity(intent);
                }
            });
        }
        else
        {
            adapter = new MyAdapter(listview_activity_secpage.this, imgarrdc,namedc,rolldc,playerinfordc);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent = new Intent(listview_activity_secpage.this,Details_Activity_thirdPage.class);
                    intent.putExtra("pos",position);
                    intent.putExtra("name",namedc);
                    intent.putExtra("roll",rolldc);
                    intent.putExtra("playerinfor",playerinfordc);
                    intent.putExtra("imgarr",imgarrdc);
                    startActivity(intent);
                }
            });
        }
    }
}