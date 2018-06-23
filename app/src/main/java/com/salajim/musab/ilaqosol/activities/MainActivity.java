package com.salajim.musab.ilaqosol.activities;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.salajim.musab.ilaqosol.R;
import com.salajim.musab.ilaqosol.adapters.SectionsPagerAdapter;
import com.salajim.musab.ilaqosol.fragments.FavoriteFragment;
import com.salajim.musab.ilaqosol.fragments.JokesFragment;
import com.salajim.musab.ilaqosol.fragments.NewJokesFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionsPagerAdapter mAdapter;
    private Context context;

    private static final Integer[] tabIcons = {R.drawable.laughing, R.drawable.new_joke, R.drawable.heart};

    ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ActionBar custom title
        toolbar = getSupportActionBar();
        toolbar.setTitle("Sheekooyin Qosol Badan");

        // tab elevation setup
        View tabs = findViewById(R.id.tabs);
        ViewCompat.setElevation(tabs, getResources().getDimension(R.dimen.action_bar_elevation));

        mAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(mViewPager);

        final TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // Setting up tabs icons
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);

        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN);
                //for removing the color of first icon when switched to next tab
                tabLayout.getTabAt(0).getIcon().clearColorFilter();
                //for other tabs
                tab.getIcon().clearColorFilter();
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    // Adding Fragments and setting the adapter with ViewPager
    private void setupViewPager(ViewPager viewPager) {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new JokesFragment(), "");
        adapter.addFragment(new NewJokesFragment(), "");
        adapter.addFragment(new FavoriteFragment(), "");

        viewPager.setAdapter(adapter);
    }

}
