package com.bignerdranch.radiotest;

import android.content.Context;

import java.util.List;

public class PersonAdapter extends RadioAdapter<Person> {
    public PersonAdapter(Context context, List<Person> items) {
        super(context, items);
    }

    @Override
    public void onBindViewHolder(RadioAdapter.ViewHolder viewHolder, int i) {
        super.onBindViewHolder(viewHolder, i);
        viewHolder.mText.setText(mItems.get(i).mName);
    }
}
