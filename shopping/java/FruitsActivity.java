package com.example.shopping;

import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FruitsActivity extends AppCompatActivity {



    
    ImageView cat;

    private ListView mListView;


    private String[] titles = { "哈密瓜" , "西瓜"};
    private String[] prices = { "￥286","￥280"};
    private  int[] icons = {R.drawable.hamimelon,R.drawable.watermelon
           };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        mListView = (ListView) findViewById(R.id.listview);



        MyBaseAdapter mAdapter = new MyBaseAdapter();
        mListView.setAdapter(mAdapter);

    }





    class MyBaseAdapter extends BaseAdapter {
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
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(FruitsActivity.this,R.layout.list_fruit,null);
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
