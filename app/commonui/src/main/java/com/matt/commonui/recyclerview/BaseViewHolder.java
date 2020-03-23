/**
 * Copyright (C), 2020-2020, matt.meng
 * All rights reserved.
 */
package com.matt.commonui.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * BaseViewHolder
 *
 * @author Matt
 * @date 2020/03/22
 */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    public BaseViewHolder(View parent) {
        super(parent);
    }

    public abstract void onBindViewHolder(@NonNull BaseViewHolder holder, BaseRecyclerViewData baseRecyclerViewData);
}
