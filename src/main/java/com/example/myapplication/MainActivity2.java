package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.UiModeManager;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {
    String itemnames[]={"Paneer Butter Masala","Veg Biryani","Kaju Paneer","Palak Paneer","Paneer Butter Masala","Veg Biryani","Kaju Paneer","Palak Paneer","Paneer Butter Masala","Veg Biryani","Kaju Paneer","Palak Paneer"};
    String ftype[]={"In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course","In Main Course"};
    String amt[]={"Rs.259","Rs.200","Rs.309","Rs.229","Rs.259","Rs.200","Rs.309","Rs.229","Rs.259","Rs.200","Rs.309","Rs.229"};
    int pict[]={R.drawable.p11,R.drawable.biryani,R.drawable.kp,R.drawable.p44,R.drawable.p11,R.drawable.biryani,R.drawable.kp,R.drawable.p44,R.drawable.p11,R.drawable.biryani,R.drawable.kp,R.drawable.p44};
    int ratpicts[]={R.drawable.ratingss,R.drawable.r2,R.drawable.ratingss,R.drawable.r2,R.drawable.ratingss,R.drawable.r2,R.drawable.ratingss,R.drawable.r2,R.drawable.ratingss,R.drawable.r2,R.drawable.ratingss,R.drawable.r2};
    String fnames[]={"Starters","Deserts","Soups","Chinese","Italian","Fried Rice","Quick Bites","Indian Breads"};
    ListView lv,lv2;
    TextView t1,t2;
    String s1,s2,s3,s4;
    int count=1;
    private UiModeManager uiModeManager;
    FloatingActionButton fb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.hname1);
        t2=findViewById(R.id.desc);
        uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);

        lv=findViewById(R.id.listv);
        lv.setAdapter(new lvadapter(this));
        getSupportActionBar().hide();
        fb=findViewById(R.id.menufab);
        lv2 = findViewById(R.id.listv2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fnames);
        lv2.setAdapter(arrayAdapter);
        lv2.setVisibility(View.INVISIBLE);
        fb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                count = count+1;
                if(count%2==0){
                    lv2.setVisibility(View.VISIBLE);
                    lv.setAlpha(Float.parseFloat("0.1"));
                }
                else{
                    lv2.setVisibility(View.INVISIBLE);
                    lv.setAlpha(Float.parseFloat("1.0"));
                }
            }
        });

    }
    public void NightModeOFF(View v){
        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
    }
    public void NightModeON(View view){
        uiModeManager.setNightMode(UiModeManager.MODE_NIGHT_NO);
    }
    private class lvadapter extends BaseAdapter {
        MainActivity2 myc;
        public lvadapter(MainActivity2 hp) {myc=hp;}
        @Override
        public int getCount() {
            return itemnames.length;
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
            View v= LayoutInflater.from(myc).inflate(R.layout.fooddesign,parent,false);
            ImageView im=v.findViewById(R.id.itemimage);
            ImageView imr=v.findViewById(R.id.ri);
            TextView t1=v.findViewById(R.id.dishname);
            TextView t2=v.findViewById(R.id.ity);
            TextView t3=v.findViewById(R.id.mo);
            imr.setImageResource(ratpicts[position]);
            im.setImageResource(pict[position]);
            t1.setText(itemnames[position]);
            t2.setText(ftype[position]);
            t3.setText(amt[position]);

            return v;
        }
    }
}