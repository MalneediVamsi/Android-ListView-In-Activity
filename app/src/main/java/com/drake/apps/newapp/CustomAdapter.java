package com.drake.apps.newapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<MyBean> {

    private List<MyBean> myBeanLists;
    private Context mContext;

    public CustomAdapter(Context context, List<MyBean> myBeanList) {
        super(context, R.layout.custom_row, myBeanList);
        this.myBeanLists = myBeanList;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        MyViewHolder myViewHolder = null;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.custom_row, parent, false);
            myViewHolder = new MyViewHolder(view);
            view.setTag(myViewHolder);
            Log.d("counter", "inside if");
        } else {

            myViewHolder = (MyViewHolder) view.getTag();
            Log.d("counter", "inside else");
        }
        myViewHolder.name.setText(myBeanLists.get(position).getName());
        myViewHolder.address.setText(myBeanLists.get(position).getAddress());
        myViewHolder.img.setImageResource(myBeanLists.get(position).getImageIcon());

            /*TextView name=(TextView)convertView.findViewById(R.id.text1);
             TextView address=(TextView)convertView.findViewById(R.id.text2);
            ImageView img = (ImageView)convertView.findViewById(R.id.img);
            name.setText(myBeanLists.get(position).getName());
            address.setText(myBeanLists.get(position).getAddress());
            img.setImageResource(myBeanLists.get(position).getImageIcon());*/

        return view;
    }

    class MyViewHolder {

        TextView name;
        TextView address;
        ImageView img;

        MyViewHolder(View v) {
            name = (TextView) v.findViewById(R.id.text1);
            address = (TextView) v.findViewById(R.id.text2);
            img = (ImageView) v.findViewById(R.id.img);
        }
    }
}
