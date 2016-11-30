package com.example.user.day08_listview_02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.day08_listview_02.enties.Person;

import java.util.ArrayList;

/**
 * Created by user on 2016/11/30.
 * 适配器
 */

public class PersonAdapter extends BaseAdapter{
    private Context mContext;//上下文对象
    private int mLayout;//条目布局
    private ArrayList<Person> mData; //数据源

    public PersonAdapter(Context mContext, int mLayout, ArrayList<Person> mData) {
        this.mContext = mContext;
        this.mLayout = mLayout;
        this.mData = mData;
    }

    //返回数据源的数量
    @Override
    public int getCount() {
        return mData.size();
    }
    //复杂情况是使用，暂时忽略，获取单个条目
    @Override
    public Object getItem(int position) {
        return null;
    }
    //复杂情况是使用，暂时忽略，获取单个条目
    @Override
    public long getItemId(int position) {
        return 0;
    }
//生产条目，并返回条目
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //把条目布局转换为view
        //LayoutInflater专门用于把布局文件转换为view对象
       View _View = LayoutInflater.from(mContext).inflate(
               mLayout, //条目布局
               parent, //需要挂在在哪个容器，方法的第三个参数
               false//布尔值，
       );
        //获取到条目布局中的控件
        ImageView _Icon = (ImageView) _View.findViewById(R.id.person_icon);
        TextView _Name = (TextView) _View.findViewById(R.id.person_name);
        TextView _Phone = (TextView) _View.findViewById(R.id.person_phone);
        //获取数据
        Person _Person = mData.get(position);//方法传入的第一个参数
        //将数据与控件绑定
        _Icon.setImageResource(_Person.getIcon());
        _Name.setText(_Person.getName());
        _Phone.setText(_Person.getPhone());
        return _View;
    }
}
