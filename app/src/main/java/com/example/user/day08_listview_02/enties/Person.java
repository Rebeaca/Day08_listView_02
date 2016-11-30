package com.example.user.day08_listview_02.enties;

/**
 * Created by user on 2016/11/30.
 * 实体类
 */

public class Person {
    private int icon;
    private String name;
    private String phone;

    public Person() {
    }

    public Person(int icon, String name, String phone) {
        this.icon = icon;
        this.name = name;
        this.phone = phone;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
