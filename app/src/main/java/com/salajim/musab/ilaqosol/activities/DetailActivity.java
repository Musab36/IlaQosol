package com.salajim.musab.ilaqosol.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.salajim.musab.ilaqosol.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {
   @Bind(R.id.description)
    TextView desc;
   @Bind(R.id.heart) TextView mHeart;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private String mDescription;

   ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);

        // ActionBar custom title
        toolbar = getSupportActionBar();
        toolbar.setTitle("Sheeka Qosol Badan");

        mSharedPreferences = getSharedPreferences(mDescription, MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        Intent intent = getIntent();
        final String description = intent.getStringExtra("description");
        desc.setText(description);

        mHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDescription = mSharedPreferences.getString(description, null);
                mEditor.putString(description, description);
                mEditor.apply();
                Toast.makeText(getApplicationContext(), "Kedka ayaa lugu daray!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
