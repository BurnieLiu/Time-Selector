package org.feezu.liuli.timeselectordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import org.feezu.liuli.timeselector.TimeSelector;


public class MainActivity extends AppCompatActivity {
    private TimeSelector timeSelector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        timeSelector = new TimeSelector(this, new TimeSelector.ResultHandler() {
            @Override
            public void handle(String time) {
                Toast.makeText(getApplicationContext(), time, Toast.LENGTH_LONG).show();
            }
        }, "2015-10-27 09:33", "2016-11-29 21:54");


    }

    public void show(View v) {
        timeSelector.show();
    }
}
