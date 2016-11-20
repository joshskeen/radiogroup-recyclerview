package com.bignerdranch.radiotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.classification_select);
        List<Person> persons = Arrays.asList(new Person("Larry"), new Person("Moe"), new Person("Curly"));

        mRecyclerView.setAdapter(new RadioAdapter(persons));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
