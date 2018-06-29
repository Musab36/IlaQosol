package com.salajim.musab.ilaqosol.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.salajim.musab.ilaqosol.DatabaseHelper;
import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.models.Categories;
import com.twotoasters.jazzylistview.JazzyListView;

import java.util.List;

public class JokesDescriptionAdapter extends BaseAdapter {
    private Context context;
    List<Categories> categories;
    JazzyListView jazzyListView;
    DatabaseHelper myDB;

    public JokesDescriptionAdapter(List<Categories> categories, Context context, JazzyListView jazzyListView) {
       this.categories = categories;
       this.context = context;
       this.jazzyListView = jazzyListView;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int position) {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Categories category = categories.get(position);
        ViewHolder holder;
        if(convertView==null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.description, parent, false);
            holder.joke = (TextView) convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.joke.setText(category.getDescription());

        return convertView;
    }

    public class ViewHolder {
        TextView joke;
    }
}
