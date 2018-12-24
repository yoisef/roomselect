package com.wasta.roomselect;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inser,get;
    private MainViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        setContentView(R.layout.activity_main);
        inser=findViewById(R.id.insertt);
        get=findViewById(R.id.getrow);


        mViewModel.;
    }
}
