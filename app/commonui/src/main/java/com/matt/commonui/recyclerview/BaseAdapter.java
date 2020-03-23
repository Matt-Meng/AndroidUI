package com.matt.commonui.recyclerview;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * BaseAdapter
 *
 * @author Matt
 * @date 2020/03/22
 */
public abstract class BaseAdapter {
    public abstract BaseViewHolder onCreateViewHolder(ViewGroup parent);
}
