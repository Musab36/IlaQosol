package com.salajim.musab.ilaqosol.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.activities.DetailActivity;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Categories category = categories.get(position);
        ViewHolder holder;
        if(convertView==null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
            holder.joke = (TextView) convertView.findViewById(R.id.jokeTextView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "fonts/Chunkfive.otf");
        holder.joke.setTag(position);
        holder.joke.setText(category.getJoke());
        holder.joke.setTypeface(typeface);

        holder.joke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("description", category.getDescription());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(intent);
            }
        });

        return convertView;
    }

    public class ViewHolder {
        TextView joke;
    }
}
