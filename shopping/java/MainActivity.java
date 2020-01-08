package com.example.shopping;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {



    ImageView car;

    private ListView mListView;
    private String[] titles = { "苹果" , "哈密瓜","西瓜","水蜜桃","香蕉","柠檬","橙子"};
    private String[] prices = { "￥158","￥286","￥280", "￥209","￥301","￥145","￥998"};
    private  int[] icons = {R.drawable.apple,R.drawable.hamimelon,R.drawable.watermelon,R.drawable.honeypeach
            ,R.drawable.timg,R.drawable.nimeng ,R.drawable.orange};
    protected  void  onCreate(Bundle savedInstanState) {
        super.onCreate(savedInstanState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.lv);


        MyBaseAdapter mAdapter = new MyBaseAdapter();
        mListView.setAdapter(mAdapter);


        car=(ImageView)findViewById(R.id.car);

    car.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this, FruitsActivity.class);
            startActivity(intent);
        }
    });

    }





    class MyBaseAdapter extends  BaseAdapter {
            @Override
            public int getCount(){
                return  titles.length;
            }
            @Override
            public Object getItem(int position) {
                return  titles[position];
            }
            @Override
            public long getItemId(int position) {
                return  position;
            }
            @Override
            public View getView(int position, View convertView,ViewGroup parent) {
                View view = View.inflate(MainActivity.this,R.layout.list_item,null);
            TextView title = (TextView) view.findViewById(R.id.title);
            TextView price = (TextView) view.findViewById(R.id.price);
            ImageView iv = (ImageView) view.findViewById(R.id.iv);
            title.setText(titles[position]);
            price.setText(prices[position]);
            iv.setBackgroundResource(icons[position]);
            return view;
        }
    }








}