package com.drake.apps.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<MyBean> myBeanList;
    private CustomAdapter adapter;

    //    private GridView mGridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
//        mGridview=(GridView)findViewById(R.id.grid);
        populateValue();
        adapter = new CustomAdapter(MainActivity.this, myBeanList);
        listView.setAdapter(adapter);
//        mGridview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key", myBeanList.get(position));
                startActivity(intent);
            }
        });
    }




      /*  mGridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key", myBeanList.get(position));
                startActivity(intent);
            }
        });*/


    private void populateValue() {
        myBeanList = new ArrayList<MyBean>();
        MyBean myBean1 = new MyBean();
        myBean1.setName("Android");
        myBean1.setAddress("www.google.com");
        myBean1.setDiscription("My Name is Android");
        myBean1.setImageIcon(R.drawable.android);
        myBeanList.add(myBean1);

        MyBean myBean2 = new MyBean();
        myBean2.setName("ios");
        myBean2.setAddress("www.apple.com");
        myBean2.setDiscription("My Name is Apple");
        myBean2.setImageIcon(R.drawable.apple1);
        myBeanList.add(myBean2);

        MyBean myBean3 = new MyBean();
        myBean3.setName("Facebook");
        myBean3.setAddress("www.fb.com");
        myBean3.setDiscription("My Name is Facebook");
        myBean3.setImageIcon(R.drawable.fb);
        myBeanList.add(myBean3);

        MyBean myBean4 = new MyBean();
        myBean4.setName("Gmail");
        myBean4.setAddress("www.gmail.com");
        myBean4.setDiscription("My Name is Gmail...");
        myBean4.setImageIcon(R.drawable.gmail);
        myBeanList.add(myBean4);


        MyBean myBean5 = new MyBean();
        myBean5.setName("NewsHunt");
        myBean5.setAddress("www.news.com");
        myBean5.setDiscription("My Name is NewsHunt");
        myBean5.setImageIcon(R.drawable.hunt);
        myBeanList.add(myBean5);

        MyBean myBean6 = new MyBean();
        myBean6.setName("Messenger");
        myBean6.setAddress("www.chat.com");
        myBean6.setDiscription("My Name is Facebook Messnger");
        myBean6.setImageIcon(R.drawable.meesenger);
        myBeanList.add(myBean6);

        MyBean myBean7 = new MyBean();
        myBean7.setName("Malneedi");
        myBean7.setAddress("www.malneedi.com");
        myBean7.setDiscription("My Name is Vamsi");
        myBean7.setImageIcon(R.drawable.vamsi);
        myBeanList.add(myBean7);

        MyBean myBean8 = new MyBean();
        myBean8.setName("Camera");
        myBean8.setAddress("www.candycam.com");
        myBean8.setDiscription("CandyCam");
        myBean8.setImageIcon(R.drawable.candycam);
        myBeanList.add(myBean8);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
