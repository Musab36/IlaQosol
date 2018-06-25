package com.salajim.musab.ilaqosol.fragments;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.salajim.musab.ilaqosol.DatabaseHelper;
import com.salajim.musab.ilaqosol.R;
import com.twotoasters.jazzylistview.JazzyHelper;
import com.twotoasters.jazzylistview.JazzyListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {
    @Bind(R.id.jazz)
    JazzyListView jazzyListView;

    DatabaseHelper myDB;

    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        ButterKnife.bind(this, view);

        myDB = new DatabaseHelper(getActivity());

        ArrayList<String> myList = new ArrayList<>();
        Cursor data = myDB.getListContents();

        if (data.getCount() == 0) {
            Toast.makeText(getActivity(), "There are no contents in this list!",Toast.LENGTH_LONG).show();
        } else {
            while(data.moveToNext()) {
                myList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, myList);
                jazzyListView.setAdapter(listAdapter);
                jazzyListView.setTransitionEffect(JazzyHelper.CARDS);
            }
        }

        return view;
    }


}
