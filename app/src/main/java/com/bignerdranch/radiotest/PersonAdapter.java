package com.bignerdranch.radiotest;

import android.content.Context;

import java.util.List;

public class PersonAdapter extends RadioAdapter<MainActivity.Person> {
    public PersonAdapter(Context context, List<MainActivity.Person> items) {
        super(context, items);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        viewHolder.mText.setText(mItems.get(i).mName);
    }
}
