package com.bignerdranch.radiotest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.classification_select);
        List<Person> persons = Arrays.asList(
                new Person("Larry"),
                new Person("Moe"),
                new Person("Curly"));

        mRecyclerView.setAdapter(new PersonAdapter(this, persons));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    class Person {
        public String mName;

        public Person(String name) {
            mName = name;
        }
    }

}
