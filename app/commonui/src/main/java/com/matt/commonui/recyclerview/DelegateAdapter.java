/**
 * Copyright (C), 2020-2020, matt.meng
 * All rights reserved.
 */
package com.matt.commonui.recyclerview;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * CommonAdapter
 *
 * @author Matt
 * @date 2020/03/22
 */
public class DelegateAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final String TAG = "DelegateAdapter";

    private ArrayList<BaseRecyclerViewData> mDataList;
    private SparseArray<BaseAdapter> mAdapterSparseArray = new SparseArray<>();

    public DelegateAdapter(ArrayList<BaseRecyclerViewData> dataList) {
        mDataList = dataList;
    }

    public DelegateAdapter bind(int viewType, BaseAdapter baseAdapter) {
        mAdapterSparseArray.put(viewType, baseAdapter);
        if (null != baseAdapter) {
            mAdapterSparseArray.put(viewType, baseAdapter);
        }
        return this;
    }


    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return mAdapterSparseArray.get(viewType).onCreateViewHolder(parent);
    }


    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        if (null == mDataList || mDataList.size() <= position) {
            Log.e(TAG, "onBindViewHolder error data is abnormal");
        }
        holder.onBindViewHolder(holder, mDataList.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        if (null == mDataList || mDataList.size() <= position) {
            Log.e(TAG, "getItemViewType error data is abnormal");
        }

        return mDataList.get(position).getViewType();
    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }
}
