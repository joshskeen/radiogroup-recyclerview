package com.bignerdranch.radiotest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    private RadioAdapter mRadioAdapter;
    public RadioButton mRadio;
    public TextView mText;

    public ViewHolder(RadioAdapter radioAdapter, final View inflate) {
        super(inflate);
        mRadioAdapter = radioAdapter;
        mText = (TextView) inflate.findViewById(R.id.text);
        mRadio = (RadioButton) inflate.findViewById(R.id.radio);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRadioAdapter.mSelectedItem = ViewHolder.this.getAdapterPosition();
                mRadioAdapter.notifyItemRangeChanged(0, mRadioAdapter.mItems.size());
            }
        };
        itemView.setOnClickListener(clickListener);
        mRadio.setOnClickListener(clickListener);
    }
}
