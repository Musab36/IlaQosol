package com.salajim.musab.ilaqosol.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.salajim.musab.ilaqosol.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
   @Bind(R.id.description)
    TextView desc;

   ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        // ActionBar custom title
        toolbar = getSupportActionBar();
        toolbar.setTitle("Sheeka Qosol Badan");

        Intent intent = getIntent();
        String description = intent.getStringExtra("description");
        desc.setText(description);
    }
}
