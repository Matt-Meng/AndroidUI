/**
 * Copyright (C), 2020-2020, Matt Meng
 * All rights reserved.
 */
package com.matt.androiduidemo.data;

import com.matt.androiduidemo.recyclerview.SingleTextAdapter;
import com.matt.commonui.recyclerview.BaseRecyclerViewData;

/**
 * SingleTextBean
 *
 * @author Matt
 * @date 2020/03/22
 */
public class SingleTextBean extends BaseRecyclerViewData {
    private static final String TAG = "SingleTextBean";

    private String mContent;

    public SingleTextBean(String content) {
        mContent = content;
    }

    @Override
    public int getViewType() {
        return SingleTextAdapter.VIEW_TYPE;
    }


    public String getContent() {
        return mContent;
    }

}
