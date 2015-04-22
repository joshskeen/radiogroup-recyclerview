package com.bignerdranch.radiotest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    public RadioButton mRadio;
    public TextView mText;

    public ViewHolder(final RadioAdapter radioAdapter, final View inflate) {
        super(inflate);
        mText = (TextView) inflate.findViewById(R.id.text);
        mRadio = (RadioButton) inflate.findViewById(R.id.radio);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioAdapter.mSelectedItem = getAdapterPosition();
                radioAdapter.notifyItemRangeChanged(0, radioAdapter.mItems.size());
            }
        };
        itemView.setOnClickListener(clickListener);
        mRadio.setOnClickListener(clickListener);
    }
}
