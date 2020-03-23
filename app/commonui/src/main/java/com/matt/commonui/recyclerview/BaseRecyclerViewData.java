/**
 * Copyright (C), 2020-2020, Matt Meng
 * All rights reserved.
 */
package com.matt.commonui.recyclerview;

/**
 * BaseRecyclerViewData
 *
 * @author Matt
 * @date 2020/03/22
 */
public abstract class BaseRecyclerViewData {

    /**
     * @return recycler item view type, used for bind view holder
     */
    public abstract int getViewType();
}
