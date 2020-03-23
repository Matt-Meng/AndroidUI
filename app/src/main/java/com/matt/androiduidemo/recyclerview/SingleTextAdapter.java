/**
 * Copyright (C), 2020-2020, Matt Meng
 * All rights reserved.
 */
package com.matt.androiduidemo.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.matt.androiduidemo.R;
import com.matt.androiduidemo.data.SingleTextBean;
import com.matt.commonui.recyclerview.BaseAdapter;
import com.matt.commonui.recyclerview.BaseRecyclerViewData;
import com.matt.commonui.recyclerview.BaseViewHolder;

import androidx.annotation.NonNull;

/**
 * SingleViewHolder
 *
 * @author Matt
 * @date 2020/03/22
 */
public class SingleTextAdapter extends BaseAdapter {
    private static final String TAG = "SingleViewHolder";
    public static int VIEW_TYPE = R.layout.single_item_view;

    public SingleTextAdapter() {
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view, parent, false);
        return new SingleViewHolder(view);
    }

    class SingleViewHolder extends BaseViewHolder {
        private TextView mContentTv;

        SingleViewHolder(View view) {
            super(view);
            mContentTv = view.findViewById(R.id.single_item_tv);
        }

        @Override
        public void onBindViewHolder(@NonNull BaseViewHolder holder, BaseRecyclerViewData baseRecyclerViewData) {
            if (baseRecyclerViewData == null) {
                Log.e(TAG, "onBindViewHolder error data is null");
                return;
            }
            if (!(baseRecyclerViewData instanceof SingleTextBean)) {
                Log.e(TAG, "onBindViewHolder error data is not SingTextBean " + baseRecyclerViewData.getClass().getSimpleName());
                return;
            }
            SingleTextBean singleTextBean = (SingleTextBean) baseRecyclerViewData;
            mContentTv.setText(singleTextBean.getContent());
        }
    }
}
