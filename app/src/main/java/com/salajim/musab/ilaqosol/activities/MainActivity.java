package com.salajim.musab.ilaqosol.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
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

    private static final Integer[] tabIcons = {R.drawable.laughing, R.drawable.newjoke, R.drawable.heart};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tab elevation setup
        View tabs = findViewById(R.id.tabs);
        ViewCompat.setElevation(tabs, getResources().getDimension(R.dimen.action_bar_elevation));

        mAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        // Setting up tab icons
        for (int i = 0; i < tabIcons.length; i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);//get tab via position
            if (tab != null)
                tab.setIcon(tabIcons[i]);//set icon
        }
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
