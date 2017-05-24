package com.example.administrator.myapplication.presenter;

import com.example.administrator.myapplication.data.RecommendModel;
import com.example.administrator.myapplication.presenter.contract.RecommendContract;

/**
 * 负责与model和view的交互
 * Created by Administrator on 2017/5/22.
 */

public class RecommendPresemter implements RecommendContract.Presenter{


    private RecommendModel mModel;

    private RecommendContract.View mView;

    public RecommendPresemter(RecommendContract.View view) {
        this.mView = view;
    }

    @Override
    public void requsetDatas() {

    }
}
