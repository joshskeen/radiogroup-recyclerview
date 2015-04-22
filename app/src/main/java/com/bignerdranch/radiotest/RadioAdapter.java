package com.bignerdranch.radiotest;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public abstract class RadioAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    public int mSelectedItem = -1;
    public List<T> mItems;
    private Context mContext;

    public RadioAdapter(Context context, List<T> items) {
        mContext = context;
        mItems = items;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.mRadio.setChecked(i == mSelectedItem);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.view_item, viewGroup, false);
        return new ViewHolder(this, view);
    }

}
