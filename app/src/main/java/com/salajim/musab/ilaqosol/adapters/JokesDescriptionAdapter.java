package com.salajim.musab.ilaqosol.adapters;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.salajim.musab.ilaqosol.DatabaseHelper;
import com.salajim.musab.ilaqosol.R;

import java.util.ArrayList;

public class JokesDescriptionAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> myList;
    DatabaseHelper myDB;

    public JokesDescriptionAdapter(Context context, ArrayList<String> myList) {
        super(context, 0, myList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.description, parent, false);
        }

        TextView desc = (TextView) convertView.findViewById(R.id.description);

        myDB = new DatabaseHelper(getContext());
        //ArrayList<String> myList = new ArrayList<>();
        Cursor data = myDB.getListContents();

        if (data.getCount() == 0) {
            Toast.makeText(getContext(), "There are no contents in this list!",Toast.LENGTH_LONG).show();
        } else {
            while(data.moveToNext()) {
                myList.add(data.getString(1));
                String d = data.getString(1);
                desc.setText(d);
            }
        }

        return convertView;
    }

}
