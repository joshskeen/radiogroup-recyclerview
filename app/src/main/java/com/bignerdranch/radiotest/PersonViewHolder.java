package com.bignerdranch.radiotest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

class PersonViewHolder extends RecyclerView.ViewHolder
{
    private RadioButton mRadio;
    private TextView mText;
    private RadioAdapter mAdapterRef;

    PersonViewHolder(View itemView, final RadioAdapter adapter)
    {
        super(itemView);
        mAdapterRef = adapter;
        mText = (TextView) itemView.findViewById(R.id.text);
        mRadio = (RadioButton) itemView.findViewById(R.id.radio);
        View.OnClickListener clickListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                adapter.setSelectedItem(getAdapterPosition());
            }
        };
        itemView.setOnClickListener(clickListener);
        mRadio.setOnClickListener(clickListener);
    }

    void bind(Person person, int position)
    {
        mRadio.setChecked(position == mAdapterRef.getSelectedItem());
        mText.setText(person.mName);
    }
}
