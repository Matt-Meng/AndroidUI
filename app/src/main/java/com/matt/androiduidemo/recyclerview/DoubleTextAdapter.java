package com.matt.androiduidemo.recyclerview;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.matt.androiduidemo.R;
import com.matt.androiduidemo.data.DoubleTextBean;
import com.matt.commonui.recyclerview.BaseAdapter;
import com.matt.commonui.recyclerview.BaseRecyclerViewData;
import com.matt.commonui.recyclerview.BaseViewHolder;

import androidx.annotation.NonNull;

/**
 * DoubleTextAdapter
 *
 * @author Matt
 * @date 2020/03/23
 */
public class DoubleTextAdapter extends BaseAdapter {
    private static final String TAG = "SingleViewHolder";
    public static int VIEW_TYPE = R.layout.double_item_view;

    public DoubleTextAdapter() {
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.double_item_view, parent, false);
        return new DoubleViewHolder(view);
    }

    class DoubleViewHolder extends BaseViewHolder {
        private TextView mTitleTv;
        private TextView mFooterTv;

        DoubleViewHolder(View view) {
            super(view);
            mTitleTv = view.findViewById(R.id.double_item_title_tv);
            mFooterTv = view.findViewById(R.id.double_item_footer_tv);
        }

        @Override
        public void onBindViewHolder(@NonNull BaseViewHolder holder, BaseRecyclerViewData baseRecyclerViewData) {
            if (baseRecyclerViewData == null) {
                Log.e(TAG, "onBindViewHolder error data is null");
                return;
            }
            if (!(baseRecyclerViewData instanceof DoubleTextBean)) {
                Log.e(TAG, "onBindViewHolder error data is not SingTextBean " + baseRecyclerViewData.getClass().getSimpleName());
                return;
            }
            DoubleTextBean doubleTextBean = (DoubleTextBean) baseRecyclerViewData;
            mTitleTv.setText(doubleTextBean.getTitle());
            mFooterTv.setText(doubleTextBean.getFooter());
        }
    }
}
