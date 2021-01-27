package com.example.chris.sevo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void search(View view){
        ListView listView = (ListView)findViewById(R.id.elist);
        listView.setVisibility(View.VISIBLE);
    }
    public void questions(View view){
        Intent x = new Intent(this, Main2Activity.class);
        startActivity(x);
    }
}
