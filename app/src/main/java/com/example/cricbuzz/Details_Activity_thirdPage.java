package com.example.cricbuzz;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity_thirdPage extends AppCompatActivity {

    TextView txt1,txt2,txt3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_third_page);
        txt1=findViewById(R.id.Details_txt1);
        txt2=findViewById(R.id.Details_txt2);
        txt3=findViewById(R.id.Details_txt3);
        imageView=findViewById(R.id.Details_imageview);

        int position=getIntent().getIntExtra("pos",0);
        String name[]=getIntent().getStringArrayExtra("name");
        String roll[]=getIntent().getStringArrayExtra("roll");
        String playerinfor[]=getIntent().getStringArrayExtra("playerinfor");
        int imgearr[]=getIntent().getIntArrayExtra("imgarr");

        txt1.setText(""+name[position]);
        txt2.setText(""+roll[position]);
        txt3.setText(""+playerinfor[position]);
        imageView.setImageResource(imgearr[position]);
    }
}