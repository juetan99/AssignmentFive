package com.example.juet.assignmentfive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mainListView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainListView = (ListView)findViewById(R.id.mainListView);

        initListView();
    }

    private void initListView(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_layout_entry, R.id.tvItem);
        adapter.add("Monday");
        adapter.add("Tuesday");
        adapter.add("Wednesday");
        adapter.add("Thursday");
        adapter.add("Friday");
        adapter.add("Saturday");
        adapter.add("Sunday");

        this.mainListView.setAdapter(adapter);

    }
}
