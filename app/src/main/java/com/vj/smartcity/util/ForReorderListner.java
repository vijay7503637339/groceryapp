package com.vj.smartcity.util;

import com.vj.smartcity.modelclass.NewPendingDataModel;

import java.util.ArrayList;

public interface ForReorderListner {

    void onReorderClick(ArrayList<NewPendingDataModel> pastOrderSubModelArrayList);
}
