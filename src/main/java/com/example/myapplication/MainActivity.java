package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;
import android.view.View;
import android.app.UiModeManager;
public class MainActivity extends AppCompatActivity {
    Integer [] rimg={R.drawable.res1,R.drawable.res1,R.drawable.res1,R.drawable.res1,R.drawable.res1,R.drawable.res1};
    Integer[] imagesfood = {R.drawable.dosa, R.drawable.biry, R.drawable.pizza,R.drawable.manc, R.drawable.salad,R.drawable.chat,R.drawable.burger};
    String arr[]={"Rest-Inn Hotel","Hotel Grand Gayatri","Varsha's Dine-Inn","Pizza By Slide"};
    List<Integer> images2 = Arrays.asList(imagesfood);
    List<Integer> images3=Arrays.asList(rimg);
    int count = 1, count1 = 1, count3 = 1;
    ListView l;
    TextView t1,t2;
    private  UiModeManager uiModeManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);
        Gallery gv2=findViewById(R.id.gallery2);
        gv2.setAdapter(new MyAdap(this));
        gv2.setSelection(0);

        ImageView imh=findViewById(R.id.gb3);
        imh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }
        });
        ImageView imh1=findViewById(R.id.gb4);
        imh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i1);

            }
        });
        ImageView imh2=findViewById(R.id.gb5);
        imh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i2);

            }
        });
        ImageView imh3=findViewById(R.id.gb6);
        imh3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3=new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i3);

            }
        });
        Button b1=findViewById(R.id.gb1);
        Button b2=findViewById(R.id.gb2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ib1=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(ib1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ib2=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(ib2);
            }
        });
    }
    public void NightModeON(View v){
        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
    }
    public void NightModeOFF(View v){
        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
    }
    private class MyAdap extends BaseAdapter {
        Context myContext2;
        public MyAdap(MainActivity hm) {
            myContext2=hm;
        }
        @Override
        public int getCount() {
            return images2.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view2 = LayoutInflater.from(myContext2).inflate(R.layout.album, parent, false);

            ImageView img2 = view2.findViewById(R.id.imageView5);
            img2.setImageResource(images2.get(position));
            //img2.setImageResource(images2.get(position));
            return view2;
        }
    }
}


