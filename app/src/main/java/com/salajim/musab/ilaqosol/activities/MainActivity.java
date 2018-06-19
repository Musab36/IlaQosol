package com.salajim.musab.ilaqosol.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.adapters.JokesCategoriesAdapter;
import com.salajim.musab.ilaqosol.models.Categories;
import com.twotoasters.jazzylistview.JazzyHelper;
import com.twotoasters.jazzylistview.JazzyListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private JokesCategoriesAdapter mAdapter;
    private List<Categories> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories = new ArrayList<>();

        JazzyListView jazzyListView = new JazzyListView(this);
        mAdapter = new JokesCategoriesAdapter(categories, getApplicationContext());
        jazzyListView.setAdapter(mAdapter);

        jazzyListView.setTransitionEffect(JazzyHelper.CARDS);
        setContentView(jazzyListView);

        displayJokes();
    }

    private void displayJokes() {
        Categories category = new Categories("Sheko qosol badan oo Juxa eh", "Loma tawat aajel famal" +
                "kun atrawa sub dihut, Jenet lum esa balaw rud et hu!");
        categories.add(category);

        category = new Categories("Sheko qosol badan laba nin oo saxiba ah", "Tin selum azara bir kat hul" +
                "famaj nana tib sus ovara mit nam azal, jeer tikraw seb ejhud!");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        category = new Categories("Sheko qosol badan oo Juxa eh", "hjxcjki fkjfkj jkhjd");
        categories.add(category);

        mAdapter.notifyDataSetChanged();
    }
}
