package com.example.ruru.android_slidingconflictdemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ruru.android_slidingconflictdemo.R;
import com.example.ruru.android_slidingconflictdemo.data.DataModel;

/**
 * ListView
 */
public class GFragment extends Fragment {


    public GFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_g, container, false);
        ListView listView = view.findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(), R.layout.item, R.id.tv, DataModel.getStringList()));
        return view;
    }

}
