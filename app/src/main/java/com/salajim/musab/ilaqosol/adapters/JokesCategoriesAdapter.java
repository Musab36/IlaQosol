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

public class JokesCategoriesAdapter extends BaseAdapter {
    private List<Categories> categories;
    private Context mContext;

    public JokesCategoriesAdapter(List<Categories> categories, Context mContext) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        Categories category = categories.get(position);
        ViewHolder holder;
        if(convertView==null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
            holder.joke = (TextView) convertView.findViewById(R.id.jokeTextView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.joke.setTag(position);
        holder.joke.setText(category.getJoke());

        return convertView;
    }

    public class ViewHolder {
        TextView joke;
    }
}
