package com.matt.androiduidemo.data;

import com.matt.androiduidemo.recyclerview.DoubleTextAdapter;
import com.matt.commonui.recyclerview.BaseRecyclerViewData;

/**
 * DoubleTextBean
 *
 * @author Matt
 * @date 2020/03/23
 */
public class DoubleTextBean extends BaseRecyclerViewData {
    private String mTitle;
    private String mFooter;

    public DoubleTextBean(String title, String footer) {
        mTitle = title;
        mFooter = footer;
    }

    @Override
    public int getViewType() {
        return DoubleTextAdapter.VIEW_TYPE;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getFooter() {
        return mFooter;
    }
}
