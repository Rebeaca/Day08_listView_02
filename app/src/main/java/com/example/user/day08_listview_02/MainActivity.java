package com.example.user.day08_listview_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.user.day08_listview_02.enties.Person;

import java.util.ArrayList;

/*
* 控制类
* */
public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private int mItemLayout;
    private ArrayList<Person> mData;
    private PersonAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //初始化
        init();
    }

    private void init() {
        mListView= (ListView) findViewById(R.id.listview);
        mItemLayout=R.layout.item_layout;
        mData = new ArrayList<>();
        mData.add(new Person(R.drawable.girl,"美女-1","110"));
        mData.add(new Person(R.drawable.girl,"美女-2","120"));
        mData.add(new Person(R.drawable.girl,"美女-3","119"));
        mData.add(new Person(R.drawable.girl,"美女-4","114"));
        mData.add(new Person(R.drawable.girl,"美女-5","10086"));
        mData.add(new Person(R.drawable.girl,"美女-6","10010"));
        mAdapter = new PersonAdapter(this,mItemLayout,mData);
        mListView.setAdapter(mAdapter);
    }
}
