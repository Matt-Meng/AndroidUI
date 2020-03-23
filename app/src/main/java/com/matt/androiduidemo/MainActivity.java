package com.matt.androiduidemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.matt.androiduidemo.data.DoubleTextBean;
import com.matt.androiduidemo.data.SingleTextBean;
import com.matt.androiduidemo.recyclerview.DoubleTextAdapter;
import com.matt.androiduidemo.recyclerview.SingleTextAdapter;
import com.matt.commonui.recyclerview.BaseRecyclerViewData;
import com.matt.commonui.recyclerview.DelegateAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private RecyclerView mContentRv;
    private ArrayList<BaseRecyclerViewData> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mDataList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                mDataList.add(new DoubleTextBean(String.valueOf(i)
                        , String.valueOf(1000 * i)));
            } else {
                mDataList.add(new SingleTextBean(String.valueOf(1000 * i)));
            }
        }
    }

    private void initView() {
        mContentRv = findViewById(R.id.main_content_rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mContentRv.setLayoutManager(layoutManager);

        DelegateAdapter delegateAdapter = new DelegateAdapter(mDataList)
                .bind(SingleTextAdapter.VIEW_TYPE, new SingleTextAdapter())
                .bind(DoubleTextAdapter.VIEW_TYPE, new DoubleTextAdapter());
        mContentRv.setAdapter(delegateAdapter);
    }
}
