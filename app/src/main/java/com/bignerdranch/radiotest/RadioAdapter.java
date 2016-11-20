package com.bignerdranch.radiotest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

class RadioAdapter extends RecyclerView.Adapter<PersonViewHolder>
{
    private List<Person> mItems;
    private int mSelectedItem = -1;

    RadioAdapter(List<Person> items)
    {
        mItems = items;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item, parent, false);
        return new PersonViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position)
    {
        holder.bind(mItems.get(position), position);
    }

    @Override
    public int getItemCount()
    {
        return mItems.size();
    }

    int getSelectedItem()
    {
        return mSelectedItem;
    }

    void setSelectedItem(int mSelectedItem)
    {
        this.mSelectedItem = mSelectedItem;
        notifyItemRangeChanged(0, mItems.size());
    }

}
