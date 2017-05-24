package com.example.administrator.myapplication.presenter.contract;

import com.example.administrator.myapplication.presenter.BasePresenter;
import com.example.administrator.myapplication.ui.BaseView;

/**
 * Created by Administrator on 2017/5/22.
 */

public interface RecommendContract {

    //接口实现接口用extends
    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter{
        public void requsetDatas();
    }


}
