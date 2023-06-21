package com.example.cricbuzz;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    listview_activity_secpage listview_activity_secpage;
    int[] imgarrgt;
    String[] namegt;
    String[] rollgt;
    String[] playerinforgt;

    int[] imgarrdc;
    String[] namedc;
    String[] rolldc;
    String[] playerinfordc;


    public MyAdapter(listview_activity_secpage listview_activity_secpage, int[] imgarr, String[] name,String[] roll, String[] playerinfor) {
        this.listview_activity_secpage = listview_activity_secpage;
        this.imgarrgt = imgarr;
        this.namegt = name;
        this.rollgt = roll;
        this.playerinforgt = playerinfor;

        this.imgarrdc = imgarr;
        this.namedc = name;
        this.rolldc = roll;
        this.playerinfordc = playerinfor;
    }

    @Override
    public int getCount() {
        return namegt.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(listview_activity_secpage).inflate(R.layout.player_images_secpage,viewGroup,false);
        ImageView imageView = view.findViewById(R.id.imageview);
        TextView textView = view.findViewById(R.id.player_secpage_txt1);
        TextView textView1 = view.findViewById(R.id.player_secpage_txt2);

        imageView.setImageResource(imgarrgt[position]);
        textView.setText(namegt[position]);
        textView1.setText(rollgt[position]);

        imageView.setImageResource(imgarrdc[position]);
        textView.setText(namedc[position]);
        textView1.setText(rolldc[position]);

        return view;
    }
}
