package com.omrobbie.androidversions;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAndroid;
    private List<AndroidPojo> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupEnv();
        setupList();

        loadDataDummy();
    }

    private void setupEnv() {
        rvAndroid = (RecyclerView) findViewById(R.id.rvAndroid);

        list = new ArrayList<>();
    }

    private void setupList() {
        AndroidAdapter adapter = new AndroidAdapter(list);
        rvAndroid.setLayoutManager(new LinearLayoutManager(this));
        rvAndroid.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        rvAndroid.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new AndroidPojo(
                "(No Codename)",
                "1.0",
                "2008-09-28",
                "-"
        ));

        list.add(new AndroidPojo(
                "(Internally known as 'Petit Four')",
                "1.1",
                "2009-02-09",
                "-"
        ));

        list.add(new AndroidPojo(
                "Cupcake",
                "1.5",
                "2009-09-15",
                "-"
        ));

        list.add(new AndroidPojo(
                "Eclair",
                "2.0 - 2.1",
                "2009-10-26",
                "-"
        ));

        list.add(new AndroidPojo(
                "Froyo",
                "2.2 - 2.2.3",
                "2010-05-20",
                "-"
        ));

        list.add(new AndroidPojo(
                "Gingerbread",
                "2.3 - 2.3.7",
                "2010-12-06",
                "-"
        ));

        list.add(new AndroidPojo(
                "Honeycomb",
                "3.0 - 3.2.6",
                "2011-02-22",
                "-"
        ));

        list.add(new AndroidPojo(
                "Ice Cream Sandwich",
                "4.0 - 4.0.4",
                "2011-10-18",
                "-"
        ));

        list.add(new AndroidPojo(
                "Jelly Bean",
                "4.1 - 4.3.1",
                "2012-07-09",
                "-"
        ));

        list.add(new AndroidPojo(
                "KitKat",
                "4.4 - 4.4.4",
                "2013-10-31",
                "-"
        ));

        list.add(new AndroidPojo(
                "Lollipop",
                "5.0 - 5.1.1",
                "2014-11-12",
                "-"
        ));

        list.add(new AndroidPojo(
                "Marhmallow",
                "6.0 - 6.0.1",
                "2015-10-05",
                "-"
        ));

        list.add(new AndroidPojo(
                "Nougat",
                "7.0 - 7.1.2",
                "2016-08-22",
                "-"
        ));

        list.add(new AndroidPojo(
                "Oreo",
                "8.0 - 8.1",
                "2017-08-21",
                ""
        ));
    }
}
