package com.leluyun.allinone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.leluyun.allinone.component.ComponentMainActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListView();
    }

    private void initListView(){
        ListView listView = (ListView)findViewById(R.id.list_view);
        String[] stringList = getResources().getStringArray(R.array.activity_main_catalog);
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(stringList));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stringArrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    MainActivity.this.startActivity(new Intent(MainActivity.this,ComponentMainActivity.class));
                }
            }
        });
    }
}
