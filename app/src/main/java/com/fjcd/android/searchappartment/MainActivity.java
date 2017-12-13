package com.fjcd.android.searchappartment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.fjcd.android.searchappartment.adapter.AppartmentAdapter;
import com.fjcd.android.searchappartment.provider.AppartmentProvider;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb;
    private RecyclerView rvAppartments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb = (Toolbar)findViewById(R.id.tb);
        setSupportActionBar(tb);
        rvAppartments = (RecyclerView)findViewById(R.id.rvAppartments);
        rvAppartments.setAdapter(new AppartmentAdapter(AppartmentProvider.getAppartments()));
        rvAppartments.setLayoutManager(new LinearLayoutManager(this));
    }
}
