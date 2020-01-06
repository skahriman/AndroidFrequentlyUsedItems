package com.sk.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.list_view);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturyday", "Sunday"};
        ArrayAdapter<String> mArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, days);

        //set the ArrayAdapter on ListView
        mListView.setAdapter(mArrayAdapter);
    }
}
