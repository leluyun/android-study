package com.leluyun.allinone.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leluyun.allinone.R;

public class ComponentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.catalog_component);
        setContentView(R.layout.activity_component);
    }
}
