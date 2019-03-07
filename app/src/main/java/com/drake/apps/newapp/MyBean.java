package com.drake.apps.newapp;

import java.io.Serializable;


public class MyBean implements Serializable
{

    private  String name;
    private  String address;
    private int imageIcon;
    private String discription;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getImageIcon()
    {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon)
    {
        this.imageIcon = imageIcon;
    }

    public String getDiscription()
    {
        return discription;
    }

    public void setDiscription(String discription)
    {
        this.discription = discription;
    }
}
