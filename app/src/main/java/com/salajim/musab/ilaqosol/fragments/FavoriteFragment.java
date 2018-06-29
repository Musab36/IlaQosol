package com.salajim.musab.ilaqosol.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.salajim.musab.ilaqosol.DatabaseHelper;
import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.adapters.JokesDescriptionAdapter;
import com.twotoasters.jazzylistview.JazzyHelper;
import com.twotoasters.jazzylistview.JazzyListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {
    @Bind(R.id.jazz)
    JazzyListView jazzyListView;

    private JokesDescriptionAdapter adapter;

    DatabaseHelper myDB;
    private String filter = "";

    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        ButterKnife.bind(this, view);

        loadData(filter);

        return view;
    }

    private void loadData(String filter) {
        myDB = new DatabaseHelper(getActivity());
        adapter = new JokesDescriptionAdapter(myDB.jokes(filter), getActivity(), jazzyListView);
        jazzyListView.setAdapter(adapter);
        jazzyListView.setTransitionEffect(JazzyHelper.CARDS);
    }


}
