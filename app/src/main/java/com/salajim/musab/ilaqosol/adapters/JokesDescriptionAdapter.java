package com.salajim.musab.ilaqosol.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.models.Categories;

import java.util.List;

public class JokesDescriptionAdapter extends BaseAdapter {
    private List<Categories> categories;
    private Context mContext;

    public JokesDescriptionAdapter(List<Categories> categories, Context mContext) {
        this.categories = categories;
        this.mContext = mContext;
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
            holder.description = (TextView) convertView.findViewById(R.id.description);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.description.setText(category.getDescription());

        return convertView;
    }

    public class ViewHolder {
        TextView description;
    }
}
